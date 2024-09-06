package org.lifeuniversity.carina.demo.db.mappers;

import org.lifeuniversity.carina.demo.db.models.UserPreference;

public interface UserPreferenceMapper {

	void create(UserPreference userPreference);

	UserPreference findById(Long id);
}
