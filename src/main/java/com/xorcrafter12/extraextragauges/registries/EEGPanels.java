package com.xorcrafter12.extraextragauges.registries;

import net.liukrast.deployer.lib.logistics.board.PanelType;
import net.liukrast.deployer.lib.registry.DeployerRegistries;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import com.xorcrafter12.extraextragauges.ExtraExtraGauges;

public class EEGPanels {
    public static final DeferredRegister<PanelType<?>> PANELS = DeferredRegister.create(DeployerRegistries.PANEL, ExtraExtraGauges.MODID);

    /*public static final DeferredHolder<PanelType<?>, PanelType<LogicPanelBehaviour>> LOGIC = PANELS.register("logic", () -> new PanelType<>(LogicPanelBehaviour::new, LogicPanelBehaviour.class));
    public static final DeferredHolder<PanelType<?>, PanelType<IntPanelBehaviour>> INT = PANELS.register("integer", () -> new PanelType<>(IntPanelBehaviour::new, IntPanelBehaviour.class));
    public static final DeferredHolder<PanelType<?>, PanelType<ComparatorPanelBehaviour>> COMPARATOR = PANELS.register("comparator", () -> new PanelType<>(ComparatorPanelBehaviour::new, ComparatorPanelBehaviour.class));
    public static final DeferredHolder<PanelType<?>, PanelType<CounterPanelBehaviour>> COUNTER = PANELS.register("counter", () -> new PanelType<>(CounterPanelBehaviour::new, CounterPanelBehaviour.class));
    public static final DeferredHolder<PanelType<?>, PanelType<PassivePanelBehaviour>> PASSIVE = PANELS.register("passive", () -> new PanelType<>(PassivePanelBehaviour::new, PassivePanelBehaviour.class));
    public static final DeferredHolder<PanelType<?>, PanelType<StringPanelBehaviour>> STRING = PANELS.register("string", () -> new PanelType<>(StringPanelBehaviour::new, StringPanelBehaviour.class));
    public static final DeferredHolder<PanelType<?>, PanelType<ExpressionPanelBehaviour>> EXPRESSION = PANELS.register("expression", () -> new PanelType<>(ExpressionPanelBehaviour::new, ExpressionPanelBehaviour.class));
    public static final DeferredHolder<PanelType<?>, PanelType<FilterPanelBehaviour>> FILTER = PANELS.register("filter", () -> new PanelType<>(FilterPanelBehaviour::new, FilterPanelBehaviour.class));
	*/
}
