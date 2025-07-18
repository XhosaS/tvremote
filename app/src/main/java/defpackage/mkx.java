package defpackage;

import com.airbnb.lottie.LottieAnimationView;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mkx {
    static acrs a(LottieAnimationView lottieAnimationView) {
        acrs acrsVar = acrs.a;
        acrr acrrVar = new acrr();
        boolean zR = lottieAnimationView.d.r();
        if ((acrrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acrrVar.y();
        }
        acrs acrsVar2 = (acrs) acrrVar.b;
        acrsVar2.c |= 1;
        acrsVar2.d = zR;
        float progress = lottieAnimationView.getProgress();
        if ((acrrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acrrVar.y();
        }
        acrs acrsVar3 = (acrs) acrrVar.b;
        acrsVar3.c |= 2;
        acrsVar3.e = progress;
        return (acrs) acrrVar.v();
    }

    static SenderStateOuterClass$SenderState b(SenderStateOuterClass$SenderState senderStateOuterClass$SenderState, acrs acrsVar) {
        acyk acykVar;
        if (senderStateOuterClass$SenderState != null) {
            acykVar = new acyk();
            acykVar.B(senderStateOuterClass$SenderState);
        } else {
            SenderStateOuterClass$SenderState senderStateOuterClass$SenderState2 = SenderStateOuterClass$SenderState.a;
            acykVar = new acyk();
        }
        acykVar.f(acrs.b, acrsVar);
        return (SenderStateOuterClass$SenderState) acykVar.v();
    }
}
