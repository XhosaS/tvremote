package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fft implements fex, jlt {
    private String a;
    private boolean b;
    private final AtomicReference c = new AtomicReference(jlv.INVOCATION_TYPE_NOT_INVOKED);

    @Override // defpackage.fex
    public final int a() {
        return 0;
    }

    @Override // defpackage.fex
    public final String b() {
        return this.a;
    }

    @Override // defpackage.fex
    public final void c(String str) {
        this.a = str;
    }

    @Override // defpackage.fex
    public final void d(boolean z) {
        this.b = z;
    }

    @Override // defpackage.fex
    public final boolean e() {
        return true;
    }

    @Override // defpackage.fex
    public final boolean f() {
        return this.b;
    }

    @Override // defpackage.fex
    public final boolean g() {
        return this.c.get() == jlv.INVOCATION_TYPE_SUGGESTION_INTENT;
    }

    @Override // defpackage.fex
    public final boolean h() {
        return this.c.get() == jlv.INVOCATION_TYPE_CLIENT_INPUT_INTENT;
    }

    @Override // defpackage.fex
    public final boolean i() {
        return this.c.get() == jlv.INVOCATION_TYPE_TEXT_SEARCH;
    }

    @Override // defpackage.fex
    public final boolean j() {
        return this.c.get() == jlv.INVOCATION_TYPE_UI_CLICK_CLIENT_INPUT_INTENT;
    }

    @Override // defpackage.fex
    public final boolean k() {
        AtomicReference atomicReference = this.c;
        return atomicReference.get() == jlv.INVOCATION_TYPE_INTENT || atomicReference.get() == jlv.INVOCATION_TYPE_HOTWORD;
    }

    @Override // defpackage.jlt
    public final void l(jlv jlvVar) {
        this.c.set(jlvVar);
    }
}
