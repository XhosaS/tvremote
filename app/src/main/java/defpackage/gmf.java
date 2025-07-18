package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import j$.time.Duration;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmf implements gmd, gmu, glq {
    private final fed a;
    private final ztw b;

    public gmf(feh fehVar, ztw ztwVar) {
        this.a = fehVar.a("com.google.android.apps.tvsearch.logging.primes.libas.ipc.LatencyLoggerService");
        this.b = ztwVar;
    }

    private static Message G(int i, gma gmaVar, Instant instant) {
        Message messageObtain = Message.obtain((Handler) null, i);
        Bundle bundle = new Bundle();
        bundle.putString("E2ELatencyEventKey", gmaVar.name());
        if (instant != null) {
            feq.d(bundle, "E2ELatencyEventTimeKey", instant);
        }
        messageObtain.setData(bundle);
        return messageObtain;
    }

    private static Message H(int i, String str) {
        Message messageObtain = Message.obtain((Handler) null, i);
        if (!str.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putString("LatencyStateAnnotatorKey", str);
            messageObtain.setData(bundle);
        }
        return messageObtain;
    }

    private static Message I(int i, String str) {
        Message messageObtain = Message.obtain((Handler) null, i);
        Bundle bundle = new Bundle();
        bundle.putString("LatencyEventKey", str);
        messageObtain.setData(bundle);
        return messageObtain;
    }

    private static Message J(int i, Instant instant, Duration duration) {
        Message messageObtain = Message.obtain((Handler) null, i);
        Bundle bundle = new Bundle();
        feq.d(bundle, "StartupEventTimeKey", instant);
        duration.getClass();
        bundle.putLong("StartupEventElapsedTimeKey", duration.toNanos());
        messageObtain.setData(bundle);
        return messageObtain;
    }

    @Override // defpackage.gmu
    public final void B() {
        throw new UnsupportedOperationException("LatencyLoggerClient holds no metrics. To reset metrics on :search process, call reset on singleton SearchResultMeasure.");
    }

    @Override // defpackage.gmu
    public final void C(gmc gmcVar, Instant instant) {
        Instant instantA = this.b.a();
        Message messageObtain = Message.obtain((Handler) null, 14);
        Bundle bundle = new Bundle();
        bundle.putString("LatencyEventKey", gmcVar.name());
        feq.d(bundle, "StartupEventTimeKey", instantA);
        messageObtain.setData(bundle);
        this.a.a(messageObtain);
    }

    @Override // defpackage.gmu
    public final void E(Instant instant, Duration duration) {
        this.a.a(J(12, instant, duration));
    }

    @Override // defpackage.gmu
    public final void F(Instant instant, Duration duration) {
        this.a.a(J(13, instant, duration));
    }

    @Override // defpackage.gmd
    public final void a(gmc gmcVar) {
        this.a.a(I(3, gmcVar.name()));
    }

    @Override // defpackage.gmd
    public final void b(gmc gmcVar) {
        this.a.a(I(4, gmcVar.name()));
    }

    @Override // defpackage.gmd
    public final void c() {
        this.a.a(Message.obtain((Handler) null, 20));
    }

    @Override // defpackage.gmd
    public final void d() {
        this.a.a(Message.obtain((Handler) null, 19));
    }

    @Override // defpackage.gmd
    public final void e(gmb gmbVar) {
        this.a.a(H(28, gmbVar.name()));
    }

    @Override // defpackage.gmd
    public final void f(gmb gmbVar) {
        this.a.a(H(27, gmbVar.name()));
    }

    @Override // defpackage.gmd
    public final void g() {
        this.a.a(H(24, ""));
    }

    @Override // defpackage.gmd
    public final void h() {
        this.a.a(H(25, ""));
    }

    @Override // defpackage.gmd
    public final void i() {
        this.a.a(H(26, ""));
    }

    @Override // defpackage.gmd
    public final void j(long j) {
        throw new UnsupportedOperationException("Attempting to record Katniss Immersive Search start latency in :search process. This should only be performed from the :interactor process.");
    }

    @Override // defpackage.gmd
    public final void k(String str) {
        throw new UnsupportedOperationException("Attempting to set parentEventId from :search process. Use cached parentEventId in :interactor process instead.");
    }

    @Override // defpackage.gmd
    public final void l(gmc gmcVar) {
        this.a.a(I(1, gmcVar.name()));
    }

    @Override // defpackage.gmd
    public final void m(gmc gmcVar) {
        n(yyk.o(gmcVar));
    }

    @Override // defpackage.gmd
    public final void n(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((gmc) it.next()).name());
        }
        yyk yykVarJ = yyk.j(arrayList);
        Message messageObtain = Message.obtain((Handler) null, 2);
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("LatencyEventKey", new ArrayList<>(yykVarJ));
        messageObtain.setData(bundle);
        this.a.a(messageObtain);
    }

    @Override // defpackage.gmd
    public final void o(gmc gmcVar, int i, String str) {
        n(yyk.o(gmcVar));
    }

    @Override // defpackage.gmd
    public final void p(gmc gmcVar, gmc gmcVar2) {
        Message messageI = I(6, gmcVar.name());
        messageI.getData().putString("NewEventKey", gmcVar2.name());
        this.a.a(messageI);
    }

    @Override // defpackage.gmd
    public final void q(gmc gmcVar, gmc gmcVar2, int i, String str) {
        p(gmcVar, gmcVar2);
    }

    @Override // defpackage.gmd
    public final void r(gmc gmcVar, rbl rblVar) {
        Message messageI = I(5, gmcVar.name());
        messageI.getData().putString("TimerStatusKey", rblVar.name());
        this.a.a(messageI);
    }

    @Override // defpackage.gmd
    public final void s() {
        throw new UnsupportedOperationException("Attempting to toggle ClientQueryId generation from :search process. This should only be performed from the :interactor process.");
    }

    @Override // defpackage.glq
    public final void t() {
        throw new UnsupportedOperationException("onQueryDetected should only be logged from :interactor process.");
    }

    @Override // defpackage.glq
    public final void u() {
        throw new UnsupportedOperationException("onServerRequestSent should only be logged from :interactor process.");
    }

    @Override // defpackage.glq
    public final void v() {
        throw new UnsupportedOperationException("onServerResponseReceived should only be logged from :interactor process.");
    }

    @Override // defpackage.glq
    public final void w(gma gmaVar) {
        this.a.a(G(22, gmaVar, null));
    }

    @Override // defpackage.glq
    public final void x() {
        throw new UnsupportedOperationException("startE2ELatencyTrace should only be logged from :interactor process.");
    }

    @Override // defpackage.glq
    public final void y(gma gmaVar) {
        z(this.b.a(), gmaVar);
    }

    @Override // defpackage.glq
    public final void z(Instant instant, gma gmaVar) {
        this.a.a(G(21, gmaVar, instant));
    }

    @Override // defpackage.gmu
    public final void A() {
    }

    @Override // defpackage.gmu
    public final /* synthetic */ void D() {
    }
}
