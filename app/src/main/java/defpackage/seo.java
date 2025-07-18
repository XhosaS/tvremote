package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.NoiseSuppressor;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class seo implements sdp {
    public static final zdy a = zdy.h("com/google/android/libraries/search/audio/audiosource/impl/AudioRecordAudioSource");
    private static final List d = agqq.d(rxh.FAILED_OPENING_ERROR_INIT, rxh.FAILED_OPENING_ZERO_LATENCY_MIC_UNSUPPORTED_AUDIO_SDK, rxh.FAILED_OPENING_ZERO_LATENCY_MIC_HOTWORD_STREAM_UNSUPPORTED);
    private yqt A;
    private yqt B;
    private final ses C;
    public final smv b;
    public final smw c;
    private final sec e;
    private final yqt f;
    private final zyd g;
    private final Context h;
    private final sey i;
    private final smx j;
    private final sdz k;
    private final yqt l;
    private final yqt m;
    private final yqt n;
    private final yqt o;
    private final yqt p;
    private final yqt q;
    private final yqt r;
    private final sab s;
    private final seq t;
    private final boolean u;
    private final boolean v;
    private final boolean w;
    private final ruo x;
    private final String y;
    private sdy z;

    public seo(sec secVar, yqt yqtVar, zyd zydVar, smv smvVar, Context context, sey seyVar, smx smxVar, sdz sdzVar, yqt yqtVar2, yqt yqtVar3, yqt yqtVar4, yqt yqtVar5, yqt yqtVar6, yqt yqtVar7, yqt yqtVar8, sab sabVar, seq seqVar, smw smwVar, boolean z, boolean z2, boolean z3) {
        this.e = secVar;
        this.f = yqtVar;
        this.g = zydVar;
        this.b = smvVar;
        this.h = context;
        this.i = seyVar;
        this.j = smxVar;
        this.k = sdzVar;
        this.l = yqtVar2;
        this.m = yqtVar3;
        this.n = yqtVar4;
        this.o = yqtVar5;
        this.p = yqtVar6;
        this.q = yqtVar7;
        this.r = yqtVar8;
        this.s = sabVar;
        this.t = seqVar;
        this.c = smwVar;
        this.u = z;
        this.v = z2;
        this.w = z3;
        ruo ruoVar = secVar.e;
        ruoVar = ruoVar == null ? ruo.a : ruoVar;
        ruoVar.getClass();
        this.x = ruoVar;
        this.y = szx.a(this);
        ypv ypvVar = ypv.a;
        this.A = ypvVar;
        this.B = ypvVar;
        this.C = new ses();
    }

    private final sec d(sec secVar, sad sadVar) throws sln {
        if (sadVar == null) {
            return secVar;
        }
        int i = sadVar.a;
        int iBitCount = Integer.bitCount(i);
        ruo ruoVar = secVar.e;
        if (ruoVar == null) {
            ruoVar = ruo.a;
        }
        if (iBitCount != Integer.bitCount(ruoVar.e)) {
            throw new sln("#createAudioRecord failed: # of ch mismatch (wrong use of AEC checker?).", skj.b(rxh.FAILED_OPENING_BUS_DEVICE));
        }
        seb sebVar = new seb();
        sebVar.B(secVar);
        if ((sebVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            sebVar.y();
        }
        sec secVar2 = (sec) sebVar.b;
        secVar2.b |= 128;
        secVar2.j = i;
        return sed.a(sebVar);
    }

    private final sln e(Throwable th) {
        if (th instanceof sln) {
            return (sln) th;
        }
        Object systemService = this.h.getSystemService("audio");
        systemService.getClass();
        int mode = ((AudioManager) systemService).getMode();
        return (mode == 2 || mode == 3) ? new sln("#createAudioRecord failed: microphone in call mode.", skj.b(rxh.FAILED_OPENING_ERROR_MODE_IN_CALL)) : new sln("#createAudioRecord failed: audio record startRecording error.", skj.b(rxh.FAILED_OPENING_ERROR_START_RECORDING));
    }

    @Override // defpackage.sdp
    public final synchronized rxd a() {
        Object objA;
        Object objA2;
        Object objA3;
        Object objA4;
        this.C.d();
        sdy sdyVar = this.z;
        if (sdyVar == null) {
            ((zdv) a.d().o(zfi.a, "ALT.AudioRecordSource").q("com/google/android/libraries/search/audio/audiosource/impl/AudioRecordAudioSource", "closeAudioSource", 336, "AudioRecordAudioSource.kt")).x("#audio# close audio source(%s) failed: no audio record", this.y);
            rxd rxdVarF = skj.f(106);
            rxdVarF.getClass();
            return rxdVarF;
        }
        AudioRecord audioRecord = sdyVar.a;
        ((zdv) a.b().o(zfi.a, "ALT.AudioRecordSource").q("com/google/android/libraries/search/audio/audiosource/impl/AudioRecordAudioSource", "closeAudioSource", 340, "AudioRecordAudioSource.kt")).D("#audio# close audio source(identity(%s), recordId(%d))", this.y, audioRecord.getAudioSessionId());
        try {
            audioRecord.stop();
            objA = agpu.a;
        } catch (Throwable th) {
            objA = agpl.a(th);
        }
        Throwable thA = agpk.a(objA);
        if (thA == null) {
            thA = null;
        }
        try {
            sdyVar.a.release();
            objA2 = agpu.a;
        } catch (Throwable th2) {
            objA2 = agpl.a(th2);
        }
        Throwable thA2 = agpk.a(objA2);
        if (thA2 != null && thA == null) {
            thA = thA2;
        }
        try {
            objA3 = agpu.a;
        } catch (Throwable th3) {
            objA3 = agpl.a(th3);
        }
        Throwable thA3 = agpk.a(objA3);
        if (thA3 != null && thA == null) {
            thA = thA3;
        }
        try {
            NoiseSuppressor noiseSuppressor = (NoiseSuppressor) this.A.f();
            if (noiseSuppressor != null) {
                noiseSuppressor.release();
            }
            AcousticEchoCanceler acousticEchoCanceler = (AcousticEchoCanceler) this.B.f();
            if (acousticEchoCanceler != null) {
                acousticEchoCanceler.release();
            }
            objA4 = agpu.a;
        } catch (Throwable th4) {
            objA4 = agpl.a(th4);
        }
        Throwable thA4 = agpk.a(objA4);
        if (thA4 != null && thA == null) {
            thA = thA4;
        }
        if (thA == null) {
            rxd rxdVarG = skj.g();
            rxdVarG.getClass();
            return rxdVarG;
        }
        ((zdv) ((zdv) a.d().o(zfi.a, "ALT.AudioRecordSource")).p(thA).q("com/google/android/libraries/search/audio/audiosource/impl/AudioRecordAudioSource", "closeAudioSource", 356, "AudioRecordAudioSource.kt")).x("#audio# close audio source(%s) failed: audio record error", this.y);
        rxd rxdVarF2 = skj.f(201);
        rxdVarF2.getClass();
        return rxdVarF2;
    }

    @Override // defpackage.sdp
    public final sds b() {
        return this.C;
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0451 A[Catch: all -> 0x0535, TryCatch #0 {, blocks: (B:4:0x0003, B:143:0x0423, B:155:0x0441, B:156:0x044c, B:168:0x0466, B:169:0x0471, B:171:0x0486, B:172:0x048b, B:174:0x04b5, B:176:0x04bc, B:179:0x04d6, B:180:0x04fd, B:182:0x04ff, B:183:0x0528, B:159:0x0451, B:161:0x0459, B:166:0x0462, B:146:0x042c, B:148:0x0434, B:153:0x043d, B:186:0x052b, B:187:0x0534, B:5:0x002e, B:7:0x003a, B:9:0x0042, B:10:0x0055, B:11:0x0062, B:12:0x0063, B:14:0x0067, B:16:0x006f, B:17:0x0082, B:18:0x008f, B:19:0x0090, B:21:0x0094, B:23:0x009a, B:25:0x00a2, B:26:0x00b5, B:27:0x00c2, B:28:0x00c3, B:30:0x00c7, B:32:0x00cf, B:33:0x00e2, B:34:0x00ef, B:35:0x00f0, B:37:0x00f6, B:39:0x00fe, B:40:0x0111, B:41:0x011e, B:42:0x011f, B:44:0x0123, B:46:0x0127, B:48:0x012b, B:50:0x0133, B:52:0x0147, B:54:0x014c, B:55:0x015a, B:56:0x0167, B:58:0x016a, B:59:0x016c, B:61:0x0172, B:63:0x017a, B:64:0x018d, B:65:0x019a, B:66:0x019b, B:68:0x01a9, B:69:0x01ad, B:73:0x01f9, B:76:0x0203, B:77:0x022c, B:79:0x0257, B:84:0x0264, B:82:0x0260, B:87:0x027a, B:88:0x02b0, B:72:0x01cb, B:89:0x02b1, B:91:0x02b7, B:93:0x02bc, B:120:0x0373, B:96:0x02cb, B:98:0x02f9, B:99:0x030a, B:101:0x0316, B:103:0x031e, B:104:0x0321, B:105:0x0324, B:106:0x0328, B:108:0x032e, B:110:0x0339, B:114:0x0347, B:116:0x034b, B:118:0x0354, B:119:0x0370, B:122:0x037f, B:124:0x0387, B:125:0x03a1, B:126:0x03ae, B:128:0x03b0, B:130:0x03ba, B:132:0x03c8, B:134:0x03cd, B:136:0x03d6, B:138:0x03e4, B:140:0x03e9, B:142:0x03ef, B:184:0x0529, B:139:0x03e7, B:133:0x03cb, B:173:0x04b2), top: B:191:0x0003, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0486 A[Catch: all -> 0x0535, TryCatch #0 {, blocks: (B:4:0x0003, B:143:0x0423, B:155:0x0441, B:156:0x044c, B:168:0x0466, B:169:0x0471, B:171:0x0486, B:172:0x048b, B:174:0x04b5, B:176:0x04bc, B:179:0x04d6, B:180:0x04fd, B:182:0x04ff, B:183:0x0528, B:159:0x0451, B:161:0x0459, B:166:0x0462, B:146:0x042c, B:148:0x0434, B:153:0x043d, B:186:0x052b, B:187:0x0534, B:5:0x002e, B:7:0x003a, B:9:0x0042, B:10:0x0055, B:11:0x0062, B:12:0x0063, B:14:0x0067, B:16:0x006f, B:17:0x0082, B:18:0x008f, B:19:0x0090, B:21:0x0094, B:23:0x009a, B:25:0x00a2, B:26:0x00b5, B:27:0x00c2, B:28:0x00c3, B:30:0x00c7, B:32:0x00cf, B:33:0x00e2, B:34:0x00ef, B:35:0x00f0, B:37:0x00f6, B:39:0x00fe, B:40:0x0111, B:41:0x011e, B:42:0x011f, B:44:0x0123, B:46:0x0127, B:48:0x012b, B:50:0x0133, B:52:0x0147, B:54:0x014c, B:55:0x015a, B:56:0x0167, B:58:0x016a, B:59:0x016c, B:61:0x0172, B:63:0x017a, B:64:0x018d, B:65:0x019a, B:66:0x019b, B:68:0x01a9, B:69:0x01ad, B:73:0x01f9, B:76:0x0203, B:77:0x022c, B:79:0x0257, B:84:0x0264, B:82:0x0260, B:87:0x027a, B:88:0x02b0, B:72:0x01cb, B:89:0x02b1, B:91:0x02b7, B:93:0x02bc, B:120:0x0373, B:96:0x02cb, B:98:0x02f9, B:99:0x030a, B:101:0x0316, B:103:0x031e, B:104:0x0321, B:105:0x0324, B:106:0x0328, B:108:0x032e, B:110:0x0339, B:114:0x0347, B:116:0x034b, B:118:0x0354, B:119:0x0370, B:122:0x037f, B:124:0x0387, B:125:0x03a1, B:126:0x03ae, B:128:0x03b0, B:130:0x03ba, B:132:0x03c8, B:134:0x03cd, B:136:0x03d6, B:138:0x03e4, B:140:0x03e9, B:142:0x03ef, B:184:0x0529, B:139:0x03e7, B:133:0x03cb, B:173:0x04b2), top: B:191:0x0003, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04bc A[Catch: all -> 0x0535, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:143:0x0423, B:155:0x0441, B:156:0x044c, B:168:0x0466, B:169:0x0471, B:171:0x0486, B:172:0x048b, B:174:0x04b5, B:176:0x04bc, B:179:0x04d6, B:180:0x04fd, B:182:0x04ff, B:183:0x0528, B:159:0x0451, B:161:0x0459, B:166:0x0462, B:146:0x042c, B:148:0x0434, B:153:0x043d, B:186:0x052b, B:187:0x0534, B:5:0x002e, B:7:0x003a, B:9:0x0042, B:10:0x0055, B:11:0x0062, B:12:0x0063, B:14:0x0067, B:16:0x006f, B:17:0x0082, B:18:0x008f, B:19:0x0090, B:21:0x0094, B:23:0x009a, B:25:0x00a2, B:26:0x00b5, B:27:0x00c2, B:28:0x00c3, B:30:0x00c7, B:32:0x00cf, B:33:0x00e2, B:34:0x00ef, B:35:0x00f0, B:37:0x00f6, B:39:0x00fe, B:40:0x0111, B:41:0x011e, B:42:0x011f, B:44:0x0123, B:46:0x0127, B:48:0x012b, B:50:0x0133, B:52:0x0147, B:54:0x014c, B:55:0x015a, B:56:0x0167, B:58:0x016a, B:59:0x016c, B:61:0x0172, B:63:0x017a, B:64:0x018d, B:65:0x019a, B:66:0x019b, B:68:0x01a9, B:69:0x01ad, B:73:0x01f9, B:76:0x0203, B:77:0x022c, B:79:0x0257, B:84:0x0264, B:82:0x0260, B:87:0x027a, B:88:0x02b0, B:72:0x01cb, B:89:0x02b1, B:91:0x02b7, B:93:0x02bc, B:120:0x0373, B:96:0x02cb, B:98:0x02f9, B:99:0x030a, B:101:0x0316, B:103:0x031e, B:104:0x0321, B:105:0x0324, B:106:0x0328, B:108:0x032e, B:110:0x0339, B:114:0x0347, B:116:0x034b, B:118:0x0354, B:119:0x0370, B:122:0x037f, B:124:0x0387, B:125:0x03a1, B:126:0x03ae, B:128:0x03b0, B:130:0x03ba, B:132:0x03c8, B:134:0x03cd, B:136:0x03d6, B:138:0x03e4, B:140:0x03e9, B:142:0x03ef, B:184:0x0529, B:139:0x03e7, B:133:0x03cb, B:173:0x04b2), top: B:191:0x0003, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04d6 A[Catch: all -> 0x0535, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:143:0x0423, B:155:0x0441, B:156:0x044c, B:168:0x0466, B:169:0x0471, B:171:0x0486, B:172:0x048b, B:174:0x04b5, B:176:0x04bc, B:179:0x04d6, B:180:0x04fd, B:182:0x04ff, B:183:0x0528, B:159:0x0451, B:161:0x0459, B:166:0x0462, B:146:0x042c, B:148:0x0434, B:153:0x043d, B:186:0x052b, B:187:0x0534, B:5:0x002e, B:7:0x003a, B:9:0x0042, B:10:0x0055, B:11:0x0062, B:12:0x0063, B:14:0x0067, B:16:0x006f, B:17:0x0082, B:18:0x008f, B:19:0x0090, B:21:0x0094, B:23:0x009a, B:25:0x00a2, B:26:0x00b5, B:27:0x00c2, B:28:0x00c3, B:30:0x00c7, B:32:0x00cf, B:33:0x00e2, B:34:0x00ef, B:35:0x00f0, B:37:0x00f6, B:39:0x00fe, B:40:0x0111, B:41:0x011e, B:42:0x011f, B:44:0x0123, B:46:0x0127, B:48:0x012b, B:50:0x0133, B:52:0x0147, B:54:0x014c, B:55:0x015a, B:56:0x0167, B:58:0x016a, B:59:0x016c, B:61:0x0172, B:63:0x017a, B:64:0x018d, B:65:0x019a, B:66:0x019b, B:68:0x01a9, B:69:0x01ad, B:73:0x01f9, B:76:0x0203, B:77:0x022c, B:79:0x0257, B:84:0x0264, B:82:0x0260, B:87:0x027a, B:88:0x02b0, B:72:0x01cb, B:89:0x02b1, B:91:0x02b7, B:93:0x02bc, B:120:0x0373, B:96:0x02cb, B:98:0x02f9, B:99:0x030a, B:101:0x0316, B:103:0x031e, B:104:0x0321, B:105:0x0324, B:106:0x0328, B:108:0x032e, B:110:0x0339, B:114:0x0347, B:116:0x034b, B:118:0x0354, B:119:0x0370, B:122:0x037f, B:124:0x0387, B:125:0x03a1, B:126:0x03ae, B:128:0x03b0, B:130:0x03ba, B:132:0x03c8, B:134:0x03cd, B:136:0x03d6, B:138:0x03e4, B:140:0x03e9, B:142:0x03ef, B:184:0x0529, B:139:0x03e7, B:133:0x03cb, B:173:0x04b2), top: B:191:0x0003, inners: #4, #5 }] */
    @Override // defpackage.sdp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized defpackage.yqt c() {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.seo.c():yqt");
    }
}
