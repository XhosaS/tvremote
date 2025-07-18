package defpackage;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tll {
    public final int a;
    public final List b;
    public final /* synthetic */ Object c;

    public tll(tlm tlmVar, int i, List list) {
        this.c = tlmVar;
        this.a = i;
        this.b = list;
    }

    public static final void b(int i) {
        if (i == 2) {
            ((tug) ((tug) tlm.a.g()).j("com/google/android/tv/remote/virtual/audio/VoiceServiceAudioRecorder$VoiceServiceInputListener", "onRecordFailed", 128, "VoiceServiceAudioRecorder.java")).s("onVoiceRequest without microphone permission");
        }
    }

    public final boolean a(byte[] bArr) {
        boolean z;
        float fSqrt;
        tlm tlmVar = (tlm) this.c;
        tvv tvvVar = tlmVar.d;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) tvvVar.a;
        boolean z2 = false;
        if (byteArrayOutputStream.size() < 1600) {
            byteArrayOutputStream.write(bArr, 0, bArr.length);
            z = false;
        } else {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int length = byteArray.length;
            if (length == 0) {
                z = false;
                fSqrt = -2.0f;
            } else {
                int i = length >> 1;
                long j = 0;
                int i2 = 0;
                long j2 = 0;
                while (i2 < length) {
                    j2 += (short) (byteArray[i2] | (byteArray[i2 + 1] << 8));
                    j += r15 * r15;
                    i2 += 2;
                    z2 = z2;
                }
                z = z2;
                fSqrt = (float) Math.sqrt(((j * i) - (j2 * j2)) / (i * i));
            }
            int iMin = Math.min((int) (((Math.min(Math.max(fSqrt, -2.0f), 200.0f) + 2.0f) * 100.0f) / 202.0f), 85) + ((int) (Math.random() * 16.0d));
            Iterator it = ((iwu) ((tlm) tvvVar.b).e.a).g.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                ((ivp) ((pku) next).a).f().c = iMin;
            }
            byteArrayOutputStream.reset();
        }
        tmi tmiVar = tlmVar.c;
        int i3 = tmiVar.f;
        if (i3 == 0) {
            ((tug) ((tug) tmi.a.g()).j("com/google/android/tv/remote/virtual/client/VoiceService", "voiceFrame", 127, "VoiceService.java")).s("No active voice sessions to stream");
        } else if (i3 <= 0 || tmiVar.e == i3) {
            byte[] bArrC = tmiVar.c.c(bArr);
            tlx tlxVar = tmiVar.d;
            vtw vtwVarM = tms.a.m();
            vsz vszVarQ = vsz.q(bArrC);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            tms tmsVar = (tms) vtwVarM.b;
            tmsVar.b = 31;
            tmsVar.c = vszVarQ;
            tlxVar.a((tms) vtwVarM.r());
            return true;
        }
        tlmVar.e.i();
        return z;
    }

    public tll(adm admVar, int i) {
        this.c = admVar;
        this.a = i;
        this.b = new ArrayList();
    }
}
