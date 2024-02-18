
CREATE TABLE IF NOT EXISTS users (
    id BIGSERIAL PRIMARY KEY,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    created_at TIMESTAMP DEFAULT NOW() NOT NULL
);


CREATE TABLE gender(
    id INT PRIMARY KEY,
    gender VARCHAR(255)
);

INSERT INTO gender(id, gender) VALUES
    (1, 'MALE'),
    (2, 'FEMALE'),
    (3, 'COSMIC WANDERER'),
    (4, 'MOONLIGHT SHADOW'),
    (5, 'STARDUST BEING'),
    (6, 'QUANTUM ENIGMA'),
    (7, 'GALACTIC TRAVELER'),
    (8, 'MYSTIC BREEZE'),
    (9, 'ETERNAL FLAME'),
    (10, 'SUNSET DREAMER'),
    (11, 'OCEAN WHISPERER'),
    (12, 'MOUNTAIN SPIRIT'),
    (13, 'FOREST GUARDIAN'),
    (14, 'DESERT MIRAGE'),
    (15, 'THUNDER ECHO'),
    (16, 'WIND DANCER'),
    (17, 'ICE CASTLE'),
    (18, 'FIRE HEART'),
    (19, 'RAINBOW CHASER'),
    (20, 'CLOUD MAKER'),
    (21, 'STARLIGHT SEEKER'),
    (22, 'NEBULA NAVIGATOR'),
    (23, 'TIME TRAVELER'),
    (24, 'DREAM WEAVER'),
    (25, 'SHADOW WALKER'),
    (26, 'LIGHT BEARER'),
    (27, 'NIGHT WATCHER'),
    (28, 'DAYDREAMER'),
    (29, 'SILVER LINING'),
    (30, 'GOLDEN HOUR'),
    (31, 'MIDNIGHT MYSTIC'),
    (32, 'DAWN SENTINEL'),
    (33, 'TWILIGHT TRAVELER'),
    (34, 'AURORA EXPLORER'),
    (35, 'DIMENSION DIVER'),
    (36, 'COSMIC SURFER'),
    (37, 'PHOENIX RISING'),
    (38, 'DRAGON SPIRIT'),
    (39, 'UNICORN WHISPERER'),
    (40, 'MERMAID SONG'),
    (41, 'PIXIE DUST'),
    (42, 'WIZARD WAVE'),
    (43, 'ELF LIGHT'),
    (44, 'TROLL TOUCH'),
    (45, 'GIANT STEP'),
    (46, 'DWARF MOUNT'),
    (47, 'FAIRY FLIGHT'),
    (48, 'GOBLIN GIGGLE'),
    (49, 'VAMPIRE VISION'),
    (50, 'WEREWOLF WANDER'),
    (51, 'ZOMBIE ZEAL'),
    (52, 'GHOST GLEAM'),
    (53, 'DEMON DANCE'),
    (54, 'ANGEL AURA'),
    (55, 'SIREN SONG'),
    (56, 'CENTAUR CHARGE'),
    (57, 'MINOTAUR MIGHT'),
    (58, 'SATYR SPRINT'),
    (59, 'NYMPH NAP'),
    (60, 'HYDRA HARMONY'),
    (61, 'DRAGONFLY DREAM'),
    (62, 'BUTTERFLY BREEZE'),
    (63, 'SPIDER SILK'),
    (64, 'ANT ANTICS'),
    (65, 'BEE BUZZ'),
    (66, 'SCORPION STING'),
    (67, 'SNAKE SLITHER'),
    (68, 'FROG FROLIC'),
    (69, 'TURTLE TRAIL'),
    (70, 'RABBIT RUN'),
    (71, 'DEER DART'),
    (72, 'WOLF WANDER');



CREATE TABLE IF NOT EXISTS user_details(
   id UUID PRIMARY KEY,
   name VARCHAR(255),
   surname VARCHAR(255),
   birthDate DATE,
   gender_id INT REFERENCES gender(id),
   other_gender VARCHAR(255),
   nation INT REFERENCES nations(id)
);

CREATE TABLE IF NOT EXISTS user_pref_lang(
   user_id BIGSERIAL REFERENCES users(id),
   pref_lang_id INT REFERENCES prefer_lang(id),
   PRIMARY KEY (user_id, pref_lang_id)
);

CREATE TABLE IF NOT EXISTS user_opinion(
    id BIGSERIAL PRIMARY KEY,
    users_id BIGSERIAL REFERENCES users(id),
    options_of_topic_id INT REFERENCES options_of_topic(id)
);



CREATE TABLE IF NOT EXISTS favourite_topics(
    id INT PRIMARY KEY,
    user_opinion_id INT REFERENCES controversial_topics(id)
);


