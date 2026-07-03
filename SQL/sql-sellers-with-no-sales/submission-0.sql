Select S.seller_name from seller s
where s.seller_id not in (
    Select seller_id from orders
    where sale_date >= '2020-01-01' and sale_date <= '2020-12-31'
)
order by s.seller_name asc