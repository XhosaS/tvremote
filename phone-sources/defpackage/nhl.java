package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class nhl {
    public final Object a;

    public nhl(Object obj) {
        this.a = obj;
    }

    public final void a(boolean z) {
        ((GestureDetector) this.a).setIsLongpressEnabled(z);
    }

    public final boolean b(MotionEvent motionEvent) {
        return ((GestureDetector) this.a).onTouchEvent(motionEvent);
    }

    public final boolean c() {
        FingerprintManager fingerprintManagerM = cmq.m((Context) this.a);
        return fingerprintManagerM != null && fingerprintManagerM.hasEnrolledFingerprints();
    }

    public final boolean d() {
        FingerprintManager fingerprintManagerM = cmq.m((Context) this.a);
        return fingerprintManagerM != null && fingerprintManagerM.isHardwareDetected();
    }

    public final du e() {
        return new du((Bundle) this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(String str, Bitmap bitmap) {
        ir irVar = du.a;
        if (irVar.containsKey(str) && ((Integer) irVar.get(str)).intValue() != 2) {
            throw new IllegalArgumentException(a.cg(str, "The ", " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.a).putParcelable(str, bitmap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(long j) {
        ir irVar = du.a;
        if (irVar.containsKey("android.media.metadata.DURATION") && ((Integer) irVar.get("android.media.metadata.DURATION")).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        ((Bundle) this.a).putLong("android.media.metadata.DURATION", j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(String str, String str2) {
        ir irVar = du.a;
        if (irVar.containsKey(str) && ((Integer) irVar.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(a.cg(str, "The ", " key cannot be used to put a String"));
        }
        ((Bundle) this.a).putCharSequence(str, str2);
    }

    public nhl() {
        this.a = new Bundle();
    }

    public nhl(Context context) {
        this.a = context;
        sij.l(new eij(context, 16));
    }

    public nhl(du duVar) {
        Bundle bundle = new Bundle(duVar.b);
        this.a = bundle;
        eu.c(bundle);
    }

    public nhl(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = new GestureDetector(context, onGestureListener, null);
    }
}
