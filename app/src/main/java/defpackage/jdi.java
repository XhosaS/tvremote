package defpackage;

import android.content.ContentValues;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jdi extends agtq {
    /* synthetic */ Object a;
    final /* synthetic */ jdn b;
    int c;
    ContentValues d;
    ContentValues e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdi(jdn jdnVar, agsw agswVar) {
        super(agswVar);
        this.b = jdnVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(false, this);
    }
}
