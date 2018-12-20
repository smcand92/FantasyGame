package character.interfacesForCharacters;

import room.Room;

public interface ICanMoveToNextRoom {

    boolean isRoomEmpty(Room room);

    String canMoveToNextRoom(Room room);
}
