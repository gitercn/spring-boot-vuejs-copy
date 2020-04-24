--
-- PostgreSQL database dump
--

-- Dumped from database version 12.2
-- Dumped by pg_dump version 12.2

-- Started on 2020-04-21 22:33:55

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 4 (class 2615 OID 2200)
-- Name: public; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA public;


ALTER SCHEMA public OWNER TO postgres;

--
-- TOC entry 2824 (class 0 OID 0)
-- Dependencies: 4
-- Name: SCHEMA public; Type: COMMENT; Schema: -; Owner: postgres
--

COMMENT ON SCHEMA public IS 'standard public schema';


SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 204 (class 1259 OID 24582)
-- Name: bookingdetail; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.bookingdetail (
    bookingkey character varying(10) NOT NULL,
    meetingroomkey character varying(10) NOT NULL,
    userid character varying(20),
    bookingsttm date,
    bookingedtm date,
    topic character varying(100),
    updatetm date,
    createtm date
);


ALTER TABLE public.bookingdetail OWNER TO postgres;

--
-- TOC entry 203 (class 1259 OID 24576)
-- Name: meetingroominfo; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.meetingroominfo (
    meetingroomkey character varying(10) NOT NULL,
    meetingroomid character varying(3) NOT NULL,
    capacity character varying(3),
    starttm date,
    endtm date,
    creater character varying,
    topic character varying,
    updatetm date,
    createtm date
);


ALTER TABLE public.meetingroominfo OWNER TO postgres;

--
-- TOC entry 2818 (class 0 OID 24582)
-- Dependencies: 204
-- Data for Name: bookingdetail; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.bookingdetail (bookingkey, meetingroomkey, userid, bookingsttm, bookingedtm, topic, updatetm, createtm) FROM stdin;
\.


--
-- TOC entry 2817 (class 0 OID 24576)
-- Dependencies: 203
-- Data for Name: meetingroominfo; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.meetingroominfo (meetingroomkey, meetingroomid, capacity, starttm, endtm, creater, topic, updatetm, createtm) FROM stdin;
001	001	10	\N	\N	user1	room1	\N	\N
002	002	20	\N	\N	user2	room2	\N	\N
\.


-- Completed on 2020-04-21 22:33:56

--
-- PostgreSQL database dump complete
--

