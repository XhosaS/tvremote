package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhn extends AtomicInteger {
    public bhn() {
        super(0);
    }

    @Override // java.lang.Number
    public final /* bridge */ byte byteValue() {
        return (byte) super.intValue();
    }

    @Override // java.lang.Number
    public final /* bridge */ short shortValue() {
        return (short) super.intValue();
    }
}
