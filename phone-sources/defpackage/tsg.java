package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class tsg<A, B> implements tsl<A, B> {
    private final boolean handleNullAutomatically;
    private transient tsg<B, A> reverse;

    public tsg(boolean z) {
        this.handleNullAutomatically = z;
    }

    public static <A, B> tsg<A, B> from(tsl<? super A, ? extends B> tslVar, tsl<? super B, ? extends A> tslVar2) {
        return new tsd(tslVar, tslVar2);
    }

    public static <T> tsg<T, T> identity() {
        return tse.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterator lambda$convertAll$0(Iterable iterable) {
        return new tsb(this, iterable);
    }

    private A unsafeDoBackward(B b) {
        return (A) doBackward(b);
    }

    private B unsafeDoForward(A a) {
        return (B) doForward(a);
    }

    public final <C> tsg<A, C> andThen(tsg<B, C> tsgVar) {
        return doAndThen(tsgVar);
    }

    @Override // defpackage.tsl
    @Deprecated
    public final B apply(A a) {
        return convert(a);
    }

    public final B convert(A a) {
        return correctedDoForward(a);
    }

    public Iterable<B> convertAll(Iterable<? extends A> iterable) {
        iterable.getClass();
        return new uaa(this, iterable, 1);
    }

    public A correctedDoBackward(B b) {
        if (!this.handleNullAutomatically) {
            return unsafeDoBackward(b);
        }
        if (b == null) {
            return null;
        }
        A a = (A) doBackward(b);
        a.getClass();
        return a;
    }

    public B correctedDoForward(A a) {
        if (!this.handleNullAutomatically) {
            return unsafeDoForward(a);
        }
        if (a == null) {
            return null;
        }
        B b = (B) doForward(a);
        b.getClass();
        return b;
    }

    public <C> tsg<A, C> doAndThen(tsg<B, C> tsgVar) {
        tsgVar.getClass();
        return new tsc(this, tsgVar);
    }

    protected /* bridge */ /* synthetic */ Object doBackward(Object obj) {
        uww uwwVar = (uww) obj;
        vtw vtwVarM = voh.a.m();
        if ((uwwVar.b & 1) != 0) {
            tsg tsgVarReverse = oxq.a.reverse();
            uwu uwuVarB = uwu.b(uwwVar.c);
            if (uwuVarB == null) {
                uwuVarB = uwu.ORIENTATION_UNKNOWN;
            }
            vof vofVar = (vof) tsgVarReverse.convert(uwuVarB);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            voh vohVar = (voh) vtwVarM.b;
            vohVar.c = vofVar.d;
            vohVar.b |= 1;
        }
        if ((uwwVar.b & 2) != 0) {
            tsg tsgVarReverse2 = oxq.b.reverse();
            uwv uwvVarB = uwv.b(uwwVar.d);
            if (uwvVarB == null) {
                uwvVarB = uwv.THEME_UNKNOWN;
            }
            vog vogVar = (vog) tsgVarReverse2.convert(uwvVarB);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            voh vohVar2 = (voh) vtwVarM.b;
            vohVar2.d = vogVar.d;
            vohVar2.b |= 2;
        }
        return (voh) vtwVarM.r();
    }

    protected /* bridge */ /* synthetic */ Object doForward(Object obj) {
        voh vohVar = (voh) obj;
        vtw vtwVarM = uww.a.m();
        if ((vohVar.b & 1) != 0) {
            tsg tsgVar = oxq.a;
            vof vofVarB = vof.b(vohVar.c);
            if (vofVarB == null) {
                vofVarB = vof.ORIENTATION_UNKNOWN;
            }
            uwu uwuVar = (uwu) tsgVar.convert(vofVarB);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uww uwwVar = (uww) vtwVarM.b;
            uwwVar.c = uwuVar.d;
            uwwVar.b |= 1;
        }
        if ((vohVar.b & 2) != 0) {
            tsg tsgVar2 = oxq.b;
            vog vogVarB = vog.b(vohVar.d);
            if (vogVarB == null) {
                vogVarB = vog.THEME_UNKNOWN;
            }
            uwv uwvVar = (uwv) tsgVar2.convert(vogVarB);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uww uwwVar2 = (uww) vtwVarM.b;
            uwwVar2.d = uwvVar.d;
            uwwVar2.b |= 2;
        }
        return (uww) vtwVarM.r();
    }

    @Override // defpackage.tsl
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public tsg<B, A> reverse() {
        tsg<B, A> tsgVar = this.reverse;
        if (tsgVar != null) {
            return tsgVar;
        }
        tsf tsfVar = new tsf(this);
        this.reverse = tsfVar;
        return tsfVar;
    }

    protected tsg() {
        this(true);
    }
}
