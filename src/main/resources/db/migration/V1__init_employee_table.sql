CREATE TABLE expressDelivery (
  wayBillNum INTEGER PRIMARY KEY,
  addressee VARCHAR(64) NOT NULL,
  telephone VARCHAR(64) NOT NULL,
  weight VARCHAR(64) NOT NULL,
  state VARCHAR(64) NOT NULL,
  appointmentTime VARCHAR(64) NOT NULL
);
