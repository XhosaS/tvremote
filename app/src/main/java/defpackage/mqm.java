package defpackage;

import com.google.android.libraries.elements.interfaces.BlockRegistryProvider;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mqm extends BlockRegistryProvider {
    private final WeakReference a;

    public mqm(BlockRegistryProvider blockRegistryProvider) {
        this.a = new WeakReference(blockRegistryProvider);
    }

    @Override // com.google.android.libraries.elements.interfaces.BlockRegistryProvider
    public final String getOrCreateBlockRegistryRef() {
        BlockRegistryProvider blockRegistryProvider = (BlockRegistryProvider) this.a.get();
        return blockRegistryProvider != null ? blockRegistryProvider.getOrCreateBlockRegistryRef() : "java_weak_ref_null";
    }
}
