package com.graphql.example.http.data;

import java.util.List;

public interface FilmCharacter {
    String getId();

    String getName();

    List<String> getFriends();

    List<Integer> getAppearsIn();
}
