
select p.ID, p.NAME, p.HOST_ID
    from PLACES p
    join (SELECT ID, NAME, HOST_ID
            from PLACES
            group by host_id
            having count(*) > 1) as h 
    on p.host_id = h.host_id
    order by id