SELECT organizer_id, status, COUNT(event_id) AS count FROM Events GROUP BY organizer_id,status;
