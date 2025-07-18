package defpackage;

import j$.time.Instant;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ztv implements ztw {
    public static final ztv a;
    private static final /* synthetic */ ztv[] b;

    static {
        ztv ztvVar = new ztv();
        a = ztvVar;
        b = new ztv[]{ztvVar};
    }

    private ztv() {
    }

    public static ztv[] values() {
        return (ztv[]) b.clone();
    }

    @Override // defpackage.ztw
    public final Instant a() {
        return Instant.now();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "TimeSource.system()";
    }
}
