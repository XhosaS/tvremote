package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pyc implements aejg {
    private final aejl a;
    private final aejl b;
    private final aejl c;
    private final aejl d;
    private final aejl e;

    public pyc(aejl aejlVar, aejl aejlVar2, aejl aejlVar3, aejl aejlVar4, aejl aejlVar5) {
        this.a = aejlVar;
        this.b = aejlVar2;
        this.c = aejlVar3;
        this.d = aejlVar4;
        this.e = aejlVar5;
    }

    @Override // defpackage.agow
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final pyb a() {
        Context context = ((pym) this.a).a.a;
        context.getClass();
        return new pyb(context, (pmq) this.b.a(), (pkn) this.c.a(), (yqt) this.d.a(), (Executor) this.e.a());
    }
}
