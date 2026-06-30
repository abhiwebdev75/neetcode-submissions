Select c.customer_id, c.customer_name from customers c
WHERE c.customer_id in(
    Select customer_id from orders where product_name = 'A'
)
And c.customer_id in(
    Select customer_id from orders where product_name = 'B'
)
And c.customer_id not in(
    Select customer_id from orders o WHERE product_name = 'C'
)
order by customer_name
