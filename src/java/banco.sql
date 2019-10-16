
--
-- PostgreSQL database dump
--

-- Dumped from database version 10.10 (Ubuntu 10.10-0ubuntu0.18.04.1)
-- Dumped by pg_dump version 10.10 (Ubuntu 10.10-0ubuntu0.18.04.1)

-- Started on 2019-10-16 14:32:45 -03

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
-- TOC entry 2920 (class 1262 OID 16384)
-- Name: pub; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE pub WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'pt_BR.UTF-8' LC_CTYPE = 'pt_BR.UTF-8';


ALTER DATABASE pub OWNER TO postgres;

\connect pub

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
-- TOC entry 1 (class 3079 OID 13043)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2922 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 196 (class 1259 OID 16385)
-- Name: publicacao; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.publicacao (
    id bigint NOT NULL,
    titulo character varying(200),
    pagina_inicial integer,
    pagina_final integer,
    ano_publicacao integer,
    descricao character varying
);


ALTER TABLE public.publicacao OWNER TO postgres;

--
-- TOC entry 197 (class 1259 OID 16388)
-- Name: publicacao_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.publicacao_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.publicacao_id_seq OWNER TO postgres;

--
-- TOC entry 2923 (class 0 OID 0)
-- Dependencies: 197
-- Name: publicacao_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.publicacao_id_seq OWNED BY public.publicacao.id;


--
-- TOC entry 2789 (class 2604 OID 16390)
-- Name: publicacao id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.publicacao ALTER COLUMN id SET DEFAULT nextval('public.publicacao_id_seq'::regclass);


--
-- TOC entry 2913 (class 0 OID 16385)
-- Dependencies: 196
-- Data for Name: publicacao; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.publicacao VALUES (2, 'A Cloud-based Architecture for the Internet of Things Targeting Industrial Engine Remote Monitoring', 1, 500, 2015, 'SILVA, A. F. ; AZEVEDO, L.G. ; OHTA, R. L. ; BINOTTO, A. P. D. ; SANTOS, M. N. ; SEGURA, V. C. V. B. ; GANDOUR, F. L. . A Cloud-based Architecture for the Internet of Things Targeting Industrial Engine Remote Monitoring. In: Sensors to Cloud Architectures Workshop (SCAW 2015), 2015, San Francisco. Sensors to Cloud Architectures Workshop (SCAW 2015)');
INSERT INTO public.publicacao VALUES (3, 'The case for DevOps in scientific applications', 1, 700, 2015, 'DE BAYSER, MAXIMILIEN ; AZEVEDO, LEONARDO G. ; CERQUEIRA, RENATO . ResearchOps: The case for DevOps in scientific applications. In: 2015 IFIP/IEEE International Symposium on Integrated Network Management (IM), 2015, Ottawa. 2015 IFIP/IEEE International Symposium on Integrated Network Management (IM). v. 1. p. 1398-1404.
Available at https://www.researchgate.net/publication/283757158_ResearchOps_The_case_for_DevOps_in_scientific_applications');
INSERT INTO public.publicacao VALUES (4, 'Architecting Cloud Tools using Software Product Line Techniques: an Exploratory Study', 1, 340, 2015, 'TIZZEI, L. P. ; AZEVEDO, L.G. ; de Bayser, M. P. M. ; CERQUEIRA, R. . Architecting Cloud Tools using Software Product Line Techniques: an Exploratory Study. In: 30th ACM/SIGAPP Symposium On Applied Computing, 2015, Salamanca. 30th ACM/SIGAPP Symposium On Applied Computing. New York, USA: Association for Computing Machinery, Inc. (ACM), 2015. v. 2. p. 1441-1448.
Available at https://www.researchgate.net/publication/308846649_WISE-SPL_Bringing_Multi-tenancy_to_the_Weather_InSights_Environment_System');
INSERT INTO public.publicacao VALUES (5, 'ArchitectingBringing Multi-tenancy to the Weather InSights Environment System', 1, 897, 2015, 'SEGURA, V. C. V. B. ; TIZZEI, L. P. ; RAMIREZ, J. P. F. ; SANTOS, M. N. ; AZEVEDO, L. G. ; CERQUEIRA, R. . WISE-SPL: Bringing Multi-tenancy to the Weather InSights Environment System. In: 5th International Workshop on Product LinE Approaches in Software Engineering, 2015, Florence. 37th International Conference on Software Engineering, 2015.
Available at https://www.researchgate.net/publication/308846649_WISE-SPL_Bringing_Multi-tenancy_to_the_Weather_InSights_Environment_System');


--
-- TOC entry 2924 (class 0 OID 0)
-- Dependencies: 197
-- Name: publicacao_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.publicacao_id_seq', 5, true);


--
-- TOC entry 2791 (class 2606 OID 16395)
-- Name: publicacao PK_PUBLICACAO; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.publicacao
    ADD CONSTRAINT "PK_PUBLICACAO" PRIMARY KEY (id);


-- Completed on 2019-10-16 14:32:45 -03

--
-- PostgreSQL database dump complete
--
