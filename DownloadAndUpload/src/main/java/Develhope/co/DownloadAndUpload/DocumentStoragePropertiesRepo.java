package Develhope.co.DownloadAndUpload;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface DocumentStoragePropertiesRepo extends JpaRepository<DocumentStorageProperties, Integer> {

    @Query("Select a from DocumentStorageProperties a where user_id = ?1 and document_type = ?2")

    DocumentStorageProperties checkDocumentByUserId(Integer userId, String docType);

    @Query("Select fileName from DocumentStorageProperties a where user_id = ?1 and document_type = ?2")

    String getUploadDocumentPath(Integer userId, String docType);



}
