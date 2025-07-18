package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ylt extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Object initialValue() {
        return new Random();
    }
}
