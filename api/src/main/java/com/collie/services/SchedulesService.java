package com.collie.services;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collie.constants.ErrorMessages;
import com.collie.dtos.ScheduleDTO;
import com.collie.entities.ScheduleEntity;
import com.collie.errors.AddEntryError;
import com.collie.errors.GetEntryError;
import com.collie.errors.UpdateEntryError;
import com.collie.models.Schedule;
import com.collie.repositories.SchedulesRepository;

@Service
public class SchedulesService {
    @Autowired
    private SchedulesRepository schedulesRepository;

    public List<Schedule> getSchedules() throws GetEntryError {
        try {

            List<Schedule> schedules = schedulesRepository
                    .findAll()
                    .stream().map(dto -> new Schedule(
                            dto.getId(),
                            dto.getDate(),
                            dto.getName(),
                            dto.getPhone(),
                            dto.getPrice(),
                            dto.getService(),
                            dto.getStatus()))
                    .collect(Collectors.toList());

            Comparator<Schedule> comparator = (s1, s2) -> {
                return Long.valueOf(s1.date.getTime()).compareTo(s2.date.getTime());
            };

            Collections.sort(schedules, comparator);

            return schedules;
        } catch (Exception e) {
            LogService.error(e.getMessage());
            throw new GetEntryError(ErrorMessages.GET_ERROR);
        }
    }

    public void addSchedule(ScheduleDTO dto) throws AddEntryError {
        try {
            ScheduleEntity entity = new ScheduleEntity();
            entity.setDate(dto.getDate());
            entity.setName(dto.getName());
            entity.setPhone(dto.getPhone());
            entity.setPrice(dto.getPrice());
            entity.setService(dto.getService());
            entity.setStatus(dto.getStatus());

            schedulesRepository.save(entity);
            return;
        } catch (Exception e) {
            LogService.error(e.getMessage());
            throw new AddEntryError(ErrorMessages.UPDATE_ERROR);
        }
    }

    public void updateSchedule(long id, int status) throws UpdateEntryError {
        Optional<ScheduleEntity> response = schedulesRepository.findById(id);

        if (response.isPresent()) {
            try {
                response.get().setStatus(status);
                schedulesRepository.flush();
                return;
            } catch (Exception e) {
                LogService.error(e.getMessage());
                throw new UpdateEntryError(ErrorMessages.UPDATE_ERROR);
            }
        }

        throw new UpdateEntryError(ErrorMessages.UPDATE_ID_NOT_FOUND);
    }
}
