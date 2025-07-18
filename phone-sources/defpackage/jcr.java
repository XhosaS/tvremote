package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.view.KeyEvent;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jcr implements fnt {
    final /* synthetic */ jdd a;

    public jcr(jdd jddVar) {
        this.a = jddVar;
    }

    @Override // defpackage.fnt
    public final /* synthetic */ uhp a(fny fnyVar, fnw fnwVar, List list, int i, long j) {
        return fki.z(this, list, i, j);
    }

    @Override // defpackage.fnt
    public final void c(fny fnyVar, Intent intent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        KeyEvent keyEvent;
        fnyVar.getClass();
        intent.getClass();
        jdd jddVar = this.a;
        if (jddVar.U) {
            if (Build.VERSION.SDK_INT > 33) {
                keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT", KeyEvent.class);
            } else {
                keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                if (keyEvent == null) {
                    return;
                }
            }
            if (keyEvent != null) {
                int action = keyEvent.getAction();
                int keyCode = keyEvent.getKeyCode();
                ((tug) jdd.a.b().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/TvodPlayerFragment$mediaSessionCallback$1", "onMediaButtonEvent", 691, "TvodPlayerFragment.kt")).w("ACTION_MEDIA_BUTTON: keyAction: %s, keyCode: %s", action, keyCode);
                if (action == 0) {
                    if (keyCode == 87) {
                        jddVar.s();
                        return;
                    }
                    if (keyCode != 88) {
                        return;
                    }
                    jddVar.z();
                    new Handler(jddVar.requireContext().getMainLooper()).removeCallbacksAndMessages(null);
                    inn innVarE = jddVar.g().e(jddVar.I.c.b());
                    if (innVarE != null) {
                        jddVar.w(innVarE);
                        return;
                    }
                    by activity = jddVar.getActivity();
                    if (activity != null) {
                        activity.finishAndRemoveTask();
                    }
                }
            }
        }
    }

    @Override // defpackage.fnt
    public final /* synthetic */ uhp g(List list) {
        return fki.t(list);
    }

    @Override // defpackage.fnt
    public final /* synthetic */ fnu h(fny fnyVar) {
        return fki.u(fnyVar);
    }

    @Override // defpackage.fnt
    public final /* synthetic */ uhp i() {
        return fki.v();
    }

    @Override // defpackage.fnt
    public final /* synthetic */ uhp j() {
        return fki.w();
    }

    @Override // defpackage.fnt
    public final /* synthetic */ uhp k() {
        return fki.x();
    }

    @Override // defpackage.fnt
    public final /* synthetic */ uhp l() {
        return fki.y();
    }

    @Override // defpackage.fnt
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.fnt
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.fnt
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.fnt
    public final /* synthetic */ void f() {
    }
}
