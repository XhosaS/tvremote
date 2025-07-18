package defpackage;

import android.view.Display;
import com.google.assistant.sdk.libassistant.ActionExecutor;
import j$.time.Duration;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jip implements jiq {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/voice/libassistant/handlers/AppClientOpHandler");
    public static final Duration b;
    private static final ActionExecutor.SupportedAction h;
    public final fab c;
    public final agow d;
    public final agow e;
    public final agow f;
    public final grl g;
    private final agte i;
    private final jhs j;
    private final gph k;
    private final gmd l;
    private final jhz m;
    private final irr n;
    private final String o;
    private final List p;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(10L);
        durationOfSeconds.getClass();
        b = durationOfSeconds;
        h = jhy.a.b(fbo.J, new ActionExecutor.SupportedAction.Arg[]{new ActionExecutor.SupportedAction.Arg("open_provider_args", "assistant.api.client_op.OpenProviderArgs")}, "", new byte[0]);
    }

    public jip(fab fabVar, agte agteVar, Display display, ewc ewcVar, agow agowVar, agow agowVar2, jhs jhsVar, gph gphVar, agow agowVar3, gmd gmdVar, grl grlVar, jhz jhzVar, irr irrVar) {
        agteVar.getClass();
        display.getClass();
        ewcVar.getClass();
        agowVar2.getClass();
        jhsVar.getClass();
        gmdVar.getClass();
        grlVar.getClass();
        jhzVar.getClass();
        this.c = fabVar;
        this.i = agteVar;
        this.d = agowVar;
        this.e = agowVar2;
        this.j = jhsVar;
        this.k = gphVar;
        this.f = agowVar3;
        this.l = gmdVar;
        this.g = grlVar;
        this.m = jhzVar;
        this.n = irrVar;
        this.o = "AppClientOpHandler";
        List listSingletonList = Collections.singletonList(h);
        listSingletonList.getClass();
        this.p = listSingletonList;
    }

    @Override // defpackage.jiq
    public final Object a(agsw agswVar) {
        return ahal.a(this.i, new jii(this, null), agswVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00da A[Catch: abxv -> 0x0105, TryCatch #0 {abxv -> 0x0105, blocks: (B:12:0x0061, B:14:0x0079, B:18:0x0089, B:22:0x009b, B:25:0x00a2, B:26:0x00ab, B:27:0x00ac, B:29:0x00b7, B:31:0x00bb, B:32:0x00bd, B:34:0x00c1, B:36:0x00c8, B:38:0x00d2, B:35:0x00c6, B:39:0x00da, B:41:0x00de, B:43:0x00e2, B:45:0x00e6, B:46:0x00e8, B:48:0x00ec, B:50:0x00f3, B:52:0x00fd, B:49:0x00f1), top: B:58:0x0061 }] */
    @Override // defpackage.jiq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r4, java.util.Map r5, com.google.assistant.sdk.libassistant.ActionExecutor.ResponseParams r6, defpackage.gez r7, defpackage.agsw r8) throws defpackage.abxv {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jip.b(java.lang.String, java.util.Map, com.google.assistant.sdk.libassistant.ActionExecutor$ResponseParams, gez, agsw):java.lang.Object");
    }

    @Override // defpackage.jiq
    public final String c() {
        return this.o;
    }

    @Override // defpackage.jiq
    public final List d() {
        return this.p;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.jiq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.lang.String r10, java.util.Map r11, defpackage.gez r12, defpackage.agsw r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jip.e(java.lang.String, java.util.Map, gez, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(byte[] r10, defpackage.gez r11, defpackage.agsw r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jip.f(byte[], gez, agsw):java.lang.Object");
    }
}
