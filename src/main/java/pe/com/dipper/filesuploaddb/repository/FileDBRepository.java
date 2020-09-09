package pe.com.dipper.filesuploaddb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.dipper.filesuploaddb.model.FileDB;

public interface FileDBRepository extends JpaRepository<FileDB, String> {
}
