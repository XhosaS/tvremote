package defpackage;

import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.service.voice.VoiceInteractionSession;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jbl extends VoiceInteractionSession {
    private final agow a;
    private final agow b;
    private final agow c;
    private final agow d;
    private final agow e;
    private final mcw f;
    private final exz g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbl(mcw mcwVar, Context context, agow agowVar, agow agowVar2, exz exzVar, agow agowVar3, agow agowVar4, agow agowVar5) {
        super(context);
        mcwVar.getClass();
        agowVar.getClass();
        exzVar.getClass();
        agowVar3.getClass();
        agowVar4.getClass();
        this.f = mcwVar;
        this.a = agowVar;
        this.b = agowVar2;
        this.g = exzVar;
        this.c = agowVar3;
        this.d = agowVar4;
        this.e = agowVar5;
    }

    @Override // android.service.voice.VoiceInteractionSession
    public final void onCloseSystemDialogs() {
        if (Build.VERSION.SDK_INT <= 29) {
            super.onCloseSystemDialogs();
        }
    }

    @Override // android.service.voice.VoiceInteractionSession
    public final void onHandleAssist(Bundle bundle, AssistStructure assistStructure, AssistContent assistContent) {
        super.onHandleAssist(bundle, assistStructure, assistContent);
        if (Build.VERSION.SDK_INT > 28 || ((Boolean) this.e.a()).booleanValue()) {
            return;
        }
        hide();
    }

    @Override // android.service.voice.VoiceInteractionSession
    public final void onPrepareShow(Bundle bundle, int i) {
        super.onPrepareShow(bundle, i);
        setUiEnabled(false);
    }

    @Override // android.service.voice.VoiceInteractionSession
    public final void onShow(Bundle bundle, int i) {
        super.onShow(bundle, i);
        if (Build.VERSION.SDK_INT <= 29 || (i & 12) == 0) {
            return;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("search_type", 1);
        Intent intentPutExtras = new Intent().setAction("android.intent.action.ASSIST").putExtras(bundle);
        intentPutExtras.getClass();
        if (((Boolean) this.a.a()).booleanValue()) {
            long longExtra = intentPutExtras.getLongExtra("android.intent.extra.TIME", 0L);
            Duration durationOfNanos = Duration.ofNanos(this.f.a());
            durationOfNanos.getClass();
            if (longExtra > 0) {
                Duration durationOfMillis = Duration.ofMillis(SystemClock.uptimeMillis());
                Duration durationOfMillis2 = Duration.ofMillis(longExtra);
                durationOfMillis2.getClass();
                durationOfNanos = durationOfNanos.minus(durationOfMillis.minus(durationOfMillis2));
                durationOfNanos.getClass();
            }
            agow agowVar = this.b;
            gfl gflVarB = ((gfn) agowVar.a()).b(rpm.r()).b();
            gflVarB.f(durationOfNanos);
            gflVarB.c();
            gfl gflVarB2 = ((gfn) agowVar.a()).a(longExtra > 0 ? rpm.C() : rpm.D()).b();
            gflVarB2.f(durationOfNanos);
            gflVarB2.c();
        }
        if (!((Boolean) this.d.a()).booleanValue()) {
            this.g.d(intentPutExtras);
        } else {
            intentPutExtras.putExtra("android.intent.extra.KEY_EVENT", 219);
            ((jod) this.c.a()).b(intentPutExtras);
        }
    }

    @Override // android.service.voice.VoiceInteractionSession
    public final void onHandleAssist(VoiceInteractionSession.AssistState assistState) {
        assistState.getClass();
        super.onHandleAssist(assistState);
        if (Build.VERSION.SDK_INT < 29 || ((Boolean) this.e.a()).booleanValue()) {
            return;
        }
        hide();
    }
}
