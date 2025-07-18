package defpackage;

import android.content.ContentUris;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jnw implements jnr {
    public static final Object a;
    private static final zdy h = zdy.h("com/google/android/apps/tvsearch/voice/recognition/SpeechRecognitionServiceHandlerImpl");
    private static final Uri i;
    public final agow b;
    public boolean c;
    public jno d;
    public int e;
    public esd f;
    public jnn g;
    private final gzu j;
    private final gfr k;
    private final agow l;
    private final agow m;
    private final Map n;
    private boolean o;
    private boolean p;
    private boolean q;
    private final ese r;
    private final jny s;

    static {
        Uri uri = Uri.parse("content://com.google.android.apps.tvsearch.voice.controller.AudioFileDescriptorProvider");
        uri.getClass();
        i = uri;
        a = new Object();
    }

    public jnw(agow agowVar, gzu gzuVar, gfr gfrVar, agow agowVar2, agow agowVar3, jny jnyVar) {
        agowVar.getClass();
        gzuVar.getClass();
        gfrVar.getClass();
        agowVar3.getClass();
        jnyVar.getClass();
        this.b = agowVar;
        this.j = gzuVar;
        this.k = gfrVar;
        this.l = agowVar2;
        this.m = agowVar3;
        this.s = jnyVar;
        this.n = new LinkedHashMap();
        this.e = 2;
        this.r = new jnv(this);
    }

    static /* synthetic */ void r(jnw jnwVar) {
        jnwVar.s(jnwVar.j.a);
    }

    private final void s(String str) {
        abxk abxkVar = ahrs.a;
        ahrq ahrqVar = new ahrq();
        ahta.b(str, ahrqVar);
        ahrs ahrsVarA = ahta.a(ahrqVar);
        if (!((Boolean) this.m.a()).booleanValue()) {
            this.k.a(rpm.au(), abqb.OK, null, ahrsVarA);
            return;
        }
        gfl gflVarB = ((gfn) this.l.a()).a(rpm.au()).b();
        gflVarB.g(ahrsVarA);
        gflVarB.c();
    }

    private final boolean t(Bundle bundle) {
        try {
            synchronized (a) {
                s("com.google.android.inputmethod.latin");
                esd esdVar = this.f;
                if (esdVar != null) {
                    Parcel parcelA = esdVar.a();
                    erv.b(parcelA, bundle);
                    esdVar.K(5, parcelA);
                }
            }
            return true;
        } catch (RemoteException e) {
            ((zdv) ((zdv) h.d()).p(e).q("com/google/android/apps/tvsearch/voice/recognition/SpeechRecognitionServiceHandlerImpl", "sendAudioDataBundleToKeyboard", 472, "SpeechRecognitionServiceHandlerImpl.kt")).u("keyboardClientCallback call failed. This is expected as the client may be removed and did not get a chance to unregister the callback.");
            i("com.google.android.katniss.search.serviceapi.IKeyboardService");
            return false;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.jnr
    public final IBinder a(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1752126978:
                    if (str.equals("com.google.android.katniss.action.SPEECH_RECOGNITION_GEMINI")) {
                        synchronized (a) {
                            p(true);
                        }
                        return new jns(this);
                    }
                    break;
                case -1724205258:
                    if (str.equals("com.google.android.katniss.action.SPEECH_RECOGNITION_ASTRO")) {
                        if (!((Boolean) this.b.a()).booleanValue()) {
                            return null;
                        }
                        q(true);
                        return new jns(this);
                    }
                    break;
                case -1480088426:
                    if (str.equals("com.google.android.katniss.action.SPEECH_RECOGNITION")) {
                        return new jns(this);
                    }
                    break;
                case -749996230:
                    if (str.equals("com.google.android.katniss.action.SPEECH_RECOGNITION_DOORBELL")) {
                        synchronized (a) {
                            this.q = true;
                        }
                        return new jns(this);
                    }
                    break;
                case 1138878436:
                    if (str.equals("com.google.android.katniss.search.serviceapi.IKeyboardService")) {
                        ese eseVar = this.r;
                        eseVar.asBinder();
                        return eseVar;
                    }
                    break;
            }
        }
        ((zdv) h.d().q("com/google/android/apps/tvsearch/voice/recognition/SpeechRecognitionServiceHandlerImpl", "getBinder", 177, "SpeechRecognitionServiceHandlerImpl.kt")).x("Unsupported action: %s. This client can't bind to the service.", str);
        return null;
    }

    @Override // defpackage.jnr
    public final ParcelFileDescriptor b(Uri uri) {
        ParcelFileDescriptor parcelFileDescriptor;
        Map map = this.n;
        synchronized (map) {
            parcelFileDescriptor = (ParcelFileDescriptor) map.remove(uri);
        }
        return parcelFileDescriptor;
    }

    @Override // defpackage.jnr
    public final void c(jno jnoVar) {
        if (agvy.c(this.d, jnoVar)) {
            return;
        }
        this.d = jnoVar;
    }

    @Override // defpackage.jnr
    public final void d() {
        jnn jnnVar;
        synchronized (a) {
            try {
                r(this);
                jnnVar = this.g;
            } catch (RemoteException e) {
                ((zdv) ((zdv) h.d()).p(e).q("com/google/android/apps/tvsearch/voice/recognition/SpeechRecognitionServiceHandlerImpl", "onBeginningOfSpeech", 220, "SpeechRecognitionServiceHandlerImpl.kt")).u("speechRecognitionCallback onBeginningOfSpeech call failed");
                i("com.google.android.katniss.action.SPEECH_RECOGNITION_GEMINI");
            }
            if (jnnVar != null) {
                jnnVar.J(2, jnnVar.a());
            }
        }
    }

    @Override // defpackage.jnr
    public final void e(String str) {
        jnn jnnVar;
        synchronized (a) {
            try {
                jnnVar = this.g;
            } catch (RemoteException e) {
                ((zdv) ((zdv) h.d()).p(e).q("com/google/android/apps/tvsearch/voice/recognition/SpeechRecognitionServiceHandlerImpl", "onFinalResults", 245, "SpeechRecognitionServiceHandlerImpl.kt")).u("speechRecognitionCallback onFinalResults call failed");
                i("com.google.android.katniss.action.SPEECH_RECOGNITION_GEMINI");
            }
            if (jnnVar != null) {
                Parcel parcelA = jnnVar.a();
                parcelA.writeString(str);
                jnnVar.J(4, parcelA);
            }
        }
    }

    @Override // defpackage.jnr
    public final void f(String str) {
        jnn jnnVar;
        synchronized (a) {
            try {
                jnnVar = this.g;
            } catch (RemoteException e) {
                ((zdv) ((zdv) h.d()).p(e).q("com/google/android/apps/tvsearch/voice/recognition/SpeechRecognitionServiceHandlerImpl", "onPartialResults", 234, "SpeechRecognitionServiceHandlerImpl.kt")).u("speechRecognitionCallback onPartialResults call failed");
                i("com.google.android.katniss.action.SPEECH_RECOGNITION_GEMINI");
            }
            if (jnnVar != null) {
                Parcel parcelA = jnnVar.a();
                parcelA.writeString(str);
                jnnVar.J(3, parcelA);
            }
        }
    }

    @Override // defpackage.jnr
    public final void g(Bundle bundle) {
        jnn jnnVar;
        synchronized (a) {
            try {
                jnnVar = this.g;
            } catch (RemoteException e) {
                ((zdv) ((zdv) h.d()).p(e).q("com/google/android/apps/tvsearch/voice/recognition/SpeechRecognitionServiceHandlerImpl", "onResponse", 256, "SpeechRecognitionServiceHandlerImpl.kt")).u("speechRecognitionCallback onResponse call failed");
                i("com.google.android.katniss.action.SPEECH_RECOGNITION_GEMINI");
            }
            if (jnnVar != null) {
                Parcel parcelA = jnnVar.a();
                erv.b(parcelA, bundle);
                jnnVar.J(5, parcelA);
            }
        }
    }

    @Override // defpackage.jnr
    public final void h(jno jnoVar) {
        if (agvy.c(this.d, jnoVar)) {
            this.d = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0063 A[Catch: all -> 0x007c, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000d, B:8:0x0011, B:10:0x0019, B:11:0x0021, B:13:0x0029, B:14:0x002e, B:16:0x0036, B:17:0x0039, B:19:0x0041, B:21:0x004f, B:22:0x0055, B:24:0x005d, B:25:0x0063), top: B:31:0x0007 }] */
    @Override // defpackage.jnr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.Object r0 = defpackage.jnw.a
            java.lang.String r1 = "SpeechRecognitionServiceHandlerImpl.kt"
            monitor-enter(r0)
            if (r7 == 0) goto L63
            int r2 = r7.hashCode()     // Catch: java.lang.Throwable -> L7c
            r3 = 0
            r4 = 0
            switch(r2) {
                case -1752126978: goto L55;
                case -1724205258: goto L39;
                case -1480088426: goto L2e;
                case -749996230: goto L21;
                case 1138878436: goto L11;
                default: goto L10;
            }     // Catch: java.lang.Throwable -> L7c
        L10:
            goto L63
        L11:
            java.lang.String r2 = "com.google.android.katniss.search.serviceapi.IKeyboardService"
            boolean r2 = r7.equals(r2)     // Catch: java.lang.Throwable -> L7c
            if (r2 == 0) goto L63
            r6.f = r4     // Catch: java.lang.Throwable -> L7c
            r7 = 2
            r6.e = r7     // Catch: java.lang.Throwable -> L7c
            r6.c = r3     // Catch: java.lang.Throwable -> L7c
            goto L7a
        L21:
            java.lang.String r2 = "com.google.android.katniss.action.SPEECH_RECOGNITION_DOORBELL"
            boolean r2 = r7.equals(r2)     // Catch: java.lang.Throwable -> L7c
            if (r2 == 0) goto L63
            r6.g = r4     // Catch: java.lang.Throwable -> L7c
            r6.q = r3     // Catch: java.lang.Throwable -> L7c
            goto L7a
        L2e:
            java.lang.String r2 = "com.google.android.katniss.action.SPEECH_RECOGNITION"
            boolean r2 = r7.equals(r2)     // Catch: java.lang.Throwable -> L7c
            if (r2 == 0) goto L63
            r6.g = r4     // Catch: java.lang.Throwable -> L7c
            goto L7a
        L39:
            java.lang.String r2 = "com.google.android.katniss.action.SPEECH_RECOGNITION_ASTRO"
            boolean r2 = r7.equals(r2)     // Catch: java.lang.Throwable -> L7c
            if (r2 == 0) goto L63
            agow r7 = r6.b     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r7 = r7.a()     // Catch: java.lang.Throwable -> L7c
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L7c
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L7c
            if (r7 == 0) goto L7a
            r6.q(r3)     // Catch: java.lang.Throwable -> L7c
            r6.g = r4     // Catch: java.lang.Throwable -> L7c
            goto L7a
        L55:
            java.lang.String r2 = "com.google.android.katniss.action.SPEECH_RECOGNITION_GEMINI"
            boolean r2 = r7.equals(r2)     // Catch: java.lang.Throwable -> L7c
            if (r2 == 0) goto L63
            r6.g = r4     // Catch: java.lang.Throwable -> L7c
            r6.p(r3)     // Catch: java.lang.Throwable -> L7c
            goto L7a
        L63:
            zdy r2 = defpackage.jnw.h     // Catch: java.lang.Throwable -> L7c
            zeo r2 = r2.d()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = "com/google/android/apps/tvsearch/voice/recognition/SpeechRecognitionServiceHandlerImpl"
            java.lang.String r4 = "resetState"
            r5 = 302(0x12e, float:4.23E-43)
            zeo r1 = r2.q(r3, r4, r5, r1)     // Catch: java.lang.Throwable -> L7c
            zdv r1 = (defpackage.zdv) r1     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = "Unsupported action: %s. This client can't unbind to the service."
            r1.x(r2, r7)     // Catch: java.lang.Throwable -> L7c
        L7a:
            monitor-exit(r0)
            return
        L7c:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jnw.i(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:98:0x01e6 A[RETURN] */
    @Override // defpackage.jnr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(com.google.android.tv.remote.service.AudioStream r10) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jnw.j(com.google.android.tv.remote.service.AudioStream):boolean");
    }

    @Override // defpackage.jnr
    public final boolean k() {
        boolean z;
        synchronized (a) {
            z = this.g != null;
        }
        return z;
    }

    @Override // defpackage.jnr
    public final boolean l() {
        synchronized (a) {
            if (this.f == null) {
                if (this.g == null) {
                    return false;
                }
            }
            return true;
        }
    }

    @Override // defpackage.jnr
    public final boolean m() {
        boolean z;
        synchronized (a) {
            z = false;
            if (l()) {
                if (this.o) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // defpackage.jnr
    public final boolean n() {
        return this.p;
    }

    public final Uri o(ParcelFileDescriptor parcelFileDescriptor) {
        Uri uriWithAppendedId;
        Map map = this.n;
        synchronized (map) {
            uriWithAppendedId = ContentUris.withAppendedId(i, parcelFileDescriptor.getFd());
            uriWithAppendedId.getClass();
            map.put(uriWithAppendedId, parcelFileDescriptor);
        }
        return uriWithAppendedId;
    }

    public final void p(boolean z) {
        synchronized (a) {
            this.o = z;
        }
    }

    public final void q(boolean z) {
        synchronized (a) {
            this.p = z;
        }
    }
}
