package defpackage;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zxr {
    public static final zxr a;
    public static final Set b;
    private static final /* synthetic */ zxr[] c;

    static {
        zxr zxrVar = new zxr();
        a = zxrVar;
        c = new zxr[]{zxrVar};
        b = new CopyOnWriteArraySet();
    }

    private zxr() {
    }

    public static zxr[] values() {
        return (zxr[]) c.clone();
    }
}
