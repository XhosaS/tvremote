package defpackage;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agny implements Callable {
    public static final agny a;
    private static final /* synthetic */ agny[] b;

    static {
        agny agnyVar = new agny();
        a = agnyVar;
        b = new agny[]{agnyVar};
    }

    private agny() {
    }

    public static agny[] values() {
        return (agny[]) b.clone();
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return new HashMap();
    }
}
