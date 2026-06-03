SELECT Events.title, COUNT(Sessions.session_id) as count FROM Events INNER JOIN Sessions ON Events.event_id = Sessions.event_id GROUP BY Events.event_id, Events.title HAVING COUNT(Sessions.session_id) = (SELECT COUNT(session_id) 
    FROM Sessions 
    GROUP BY event_id 
    ORDER BY COUNT(session_id) DESC 
    LIMIT 1
);