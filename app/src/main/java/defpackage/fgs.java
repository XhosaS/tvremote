package defpackage;

import android.os.Bundle;
import android.os.Messenger;
import com.google.assistant.sdk.libassistant.AssistantManagerNative;
import com.google.protobuf.ExtensionRegistryLite;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgs {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/controller/services/KatnissInteractorProcessServicePeer");
    private static final AssistantManagerNative.VoicelessOptions s = new AssistantManagerNative.VoicelessOptions(AssistantManagerNative.RequestSource.UI_PRESS, true);
    public final eyw b;
    public final fby c;
    public final agow d;
    public final jdt e;
    public final jhs f;
    public final gzu g;
    public final gfr h;
    public final jjc i;
    public final jma j;
    public final zyh k;
    public final jkx l;
    public final ics m;
    public final lzb n;
    public final jlp o;
    public final fgr p = new fgr(this);
    public Messenger q;
    public final gsz r;

    public fgs(eyw eywVar, fby fbyVar, agow agowVar, jdt jdtVar, jhs jhsVar, gzu gzuVar, gfr gfrVar, jjc jjcVar, jma jmaVar, zyh zyhVar, jkx jkxVar, ics icsVar, gsz gszVar, lzb lzbVar, jlp jlpVar) {
        this.b = eywVar;
        this.c = fbyVar;
        this.d = agowVar;
        this.e = jdtVar;
        this.f = jhsVar;
        this.g = gzuVar;
        this.h = gfrVar;
        this.i = jjcVar;
        this.j = jmaVar;
        this.k = zyhVar;
        this.l = jkxVar;
        this.m = icsVar;
        this.r = gszVar;
        this.n = lzbVar;
        this.o = jlpVar;
    }

    public final abqb a(Bundle bundle) {
        return abqb.b(bundle.getInt("AppflowEventStatusCode", -1));
    }

    public final ahrs b(Bundle bundle) throws abxv {
        byte bByteValue;
        if (bundle.containsKey("AppflowEventOpaTvExtension")) {
            try {
                byte[] byteArray = bundle.getByteArray("AppflowEventOpaTvExtension");
                abxd abxdVarH = abxd.h(ahrs.b, byteArray, 0, byteArray.length, ExtensionRegistryLite.getGeneratedRegistry());
                if (abxdVarH != null && (bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue()) != 1) {
                    if (bByteValue != 0) {
                        boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                        abxdVarH.cM(2, true != zL ? null : abxdVarH);
                        if (zL) {
                        }
                    }
                    throw new abzz().a();
                }
                return (ahrs) abxdVarH;
            } catch (abxv e) {
                ((zdv) ((zdv) ((zdv) a.d()).p(e)).q("com/google/android/apps/tvsearch/controller/services/KatnissInteractorProcessServicePeer", "extractOpaTvExtension", (char) 634, "KatnissInteractorProcessServicePeer.java")).u("Invalid OpaTvExtension for AppFlow Logging");
            }
        }
        return null;
    }

    public final void c(byte[] bArr, int i) {
        if (i != 0) {
            this.f.j(i);
        }
        if (i == 12 || i == 4 || i == 17 || i == 18) {
            this.e.az(jlv.INVOCATION_TYPE_UI_CLICK_CLIENT_INPUT_INTENT);
        } else {
            this.e.az(jlv.INVOCATION_TYPE_CLIENT_INPUT_INTENT);
        }
        this.e.X(bArr, s);
    }

    public final byte[] d(Bundle bundle, String str) {
        byte[] byteArray = bundle.getByteArray(str);
        return byteArray != null ? byteArray : new byte[0];
    }

    public final int e(Bundle bundle) {
        return ggj.b(bundle.getInt("AppflowEventCustomStatusCode", -1));
    }
}
