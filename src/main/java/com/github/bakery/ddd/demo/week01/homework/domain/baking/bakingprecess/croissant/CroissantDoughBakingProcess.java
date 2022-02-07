package com.github.bakery.ddd.demo.week01.homework.domain.baking.bakingprecess.croissant;

import com.github.bakery.ddd.demo.week01.homework.domain.baking.BakingStep;
import com.github.bakery.ddd.demo.week01.homework.domain.baking.Bread;
import com.github.bakery.ddd.demo.week01.homework.domain.baking.material.Material;
import com.github.bakery.ddd.demo.week01.homework.domain.baking.recipe.Recipe;
import java.util.List;

public class CroissantDoughBakingProcess extends CroissantBakingProcess {

    public CroissantDoughBakingProcess() {
        super(BakingStep.DOUGH);
    }

    @Override
    public Bread process(Recipe breadRecipe, List<Material> mainMaterial, List<Material> subMaterial) {
        return new Bread(getBreadName(), getStep());
    }
}
