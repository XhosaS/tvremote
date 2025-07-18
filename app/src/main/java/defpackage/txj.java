package defpackage;

import android.content.Context;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class txj {
    public static final zdy a = zdy.h("com/google/android/libraries/speech/transcription/recognition/dataservice/TranscriptionDataService");
    public final ros b;
    public final zyg c;
    public final tuj d;
    public final tqu e;
    public final String f;
    public final Context g;
    public zyd h;
    public tui i;
    public final tru j;
    private final vyj k;
    private txo l = txo.k().a();

    public txj(vyj vyjVar, zyg zygVar, ros rosVar, tuj tujVar, tru truVar, Context context, tqu tquVar) {
        this.k = vyjVar;
        this.c = zygVar;
        this.b = rosVar;
        this.d = tujVar;
        this.j = truVar;
        this.e = tquVar;
        this.f = tquVar.c;
        this.g = context;
    }

    public static String b(String str) {
        return "Transcription:transcriptionState:".concat(String.valueOf(str));
    }

    private final synchronized boolean h() {
        if (this.l.c() != null) {
            return false;
        }
        if (this.l.d() != null) {
            if (this.l.b() != null) {
                return true;
            }
        }
        return false;
    }

    public final synchronized txo a() {
        return this.l;
    }

    public final synchronized void c(final trr trrVar) {
        if (h()) {
            return;
        }
        f(new Function() { // from class: twx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                txn txnVarF = ((txo) obj).f();
                ((tws) txnVarF).e = trrVar.a;
                return txnVarF.a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ros rosVar = this.b;
        String str = this.f;
        rqw rqwVarA = rpx.a();
        ((rqt) rqwVarA.a).i("requestId", str);
        trb trbVar = trrVar.a;
        rosVar.a(rqwVarA.a(((trd) trbVar).a, trbVar.c()));
    }

    public final void d(String str, zyd zydVar) {
        zxn.p(zydVar, wyo.f(new txi(this, str)), this.c);
    }

    public final void e() {
        rqw rqwVarA = rpx.a();
        ((rqt) rqwVarA.a).i("requestId", this.f);
        this.b.a(rqwVarA.b(abqb.OK));
    }

    public final synchronized void f(Function function) {
        txo txoVar = (txo) function.apply(this.l);
        if (txoVar.equals(this.l)) {
            return;
        }
        this.l = txoVar;
        vyj vyjVar = this.k;
        String str = this.f;
        vyjVar.a(zxy.a, b(str));
        ((zdv) ((zdv) a.b()).q("com/google/android/libraries/speech/transcription/recognition/dataservice/TranscriptionDataService", "updateTranscriptionState", 435, "TranscriptionDataService.java")).F("updated TranscriptionState: %s for request-id %s", txoVar, str);
    }

    public final synchronized boolean g(Function function) {
        f(function);
        return h();
    }
}
