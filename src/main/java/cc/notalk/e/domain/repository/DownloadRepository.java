package cc.notalk.e.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cc.notalk.e.domain.entity.Download;

public interface DownloadRepository extends JpaRepository<Download, String> {
}
