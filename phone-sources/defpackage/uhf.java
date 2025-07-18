package defpackage;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uhf {
    public static final uhf a;
    public static final Set b;
    private static final /* synthetic */ uhf[] c;

    static {
        uhf uhfVar = new uhf();
        a = uhfVar;
        c = new uhf[]{uhfVar};
        b = new CopyOnWriteArraySet();
    }

    private uhf() {
    }

    public static uhf[] values() {
        return (uhf[]) c.clone();
    }
}
