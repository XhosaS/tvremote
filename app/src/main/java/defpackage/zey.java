package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zey extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        return new Random();
    }
}
