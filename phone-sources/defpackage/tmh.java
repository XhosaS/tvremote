package defpackage;

import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tmh implements tma {
    boolean a;
    final /* synthetic */ tlx b;
    final /* synthetic */ tmi c;

    public tmh(tmi tmiVar, tlx tlxVar) {
        this.b = tlxVar;
        this.c = tmiVar;
    }

    @Override // defpackage.tma
    public final void a(tnq tnqVar) {
        int i = tnqVar.b;
        int iG = sis.g(i);
        if (iG == 0) {
            throw null;
        }
        int i2 = iG - 1;
        int i3 = 12;
        if (i2 != 2) {
            if (i2 != 11) {
                if (i2 != 12) {
                    return;
                }
                tmi tmiVar = this.c;
                if (tmiVar.e != (i == 31 ? (tns) tnqVar.c : tns.a).b) {
                    if (tmiVar.f != (tnqVar.b == 31 ? (tns) tnqVar.c : tns.a).b) {
                        ((tug) ((tug) tmi.a.g()).j("com/google/android/tv/remote/virtual/client/VoiceService$1", "handleMessage", 207, "VoiceService.java")).w("Requested voice session id %d doesn't match the closing id %d", tmiVar.e, (tnqVar.b == 31 ? (tns) tnqVar.c : tns.a).b);
                        return;
                    }
                }
                tmiVar.g.a();
                tmiVar.e = 0;
                return;
            }
            tnw tnwVar = i == 30 ? (tnw) tnqVar.c : tnw.a;
            int i4 = tnwVar.b;
            if (this.a) {
                tmi tmiVar2 = this.c;
                tmiVar2.e = i4;
                vun vunVar = tnwVar.c;
                tlm tlmVar = tmiVar2.g;
                tlk tlkVar = tlmVar.b;
                if (tlkVar != null) {
                    tlkVar.a(false);
                }
                ((tug) ((tug) tlm.a.e()).j("com/google/android/tv/remote/virtual/audio/VoiceServiceAudioRecorder", "onVoiceRequest", 43, "VoiceServiceAudioRecorder.java")).t("onVoiceRequest for session %d", i4);
                tlmVar.b = new tlk(new tll(tlmVar, i4, vunVar));
                final tlk tlkVar2 = tlmVar.b;
                if (tlkVar2.d != null) {
                    ((tug) ((tug) tlk.a.e()).j("com/google/android/tv/remote/virtual/audio/VoiceInput", "start", 48, "VoiceInput.java")).s("VoiceInput cannot be started more than once, as it is single-use.");
                    return;
                } else {
                    tlkVar2.d = new Thread(new Runnable() { // from class: tlj
                        /* JADX WARN: Removed duplicated region for block: B:50:0x0204  */
                        /* JADX WARN: Removed duplicated region for block: B:51:0x0206 A[Catch: all -> 0x02e9, TryCatch #1 {all -> 0x02e9, IllegalArgumentException -> 0x02eb, blocks: (B:3:0x000a, B:4:0x0017, B:6:0x001e, B:9:0x003c, B:12:0x0085, B:14:0x0089, B:16:0x00a5, B:18:0x00a9, B:56:0x025b, B:58:0x0260, B:62:0x0285, B:81:0x02e0, B:51:0x0206, B:52:0x0234, B:54:0x023a, B:21:0x00c3, B:23:0x00db, B:25:0x00ed, B:26:0x00f0, B:28:0x0108, B:29:0x010b, B:31:0x0123, B:32:0x0126, B:34:0x013e, B:35:0x0141, B:37:0x0151, B:39:0x016a, B:40:0x016d, B:42:0x0183, B:43:0x0186, B:45:0x01cd, B:47:0x01dd, B:48:0x01e0, B:44:0x01af, B:86:0x02eb), top: B:91:0x000a }] */
                        /* JADX WARN: Removed duplicated region for block: B:62:0x0285 A[Catch: all -> 0x02e9, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x02e9, IllegalArgumentException -> 0x02eb, blocks: (B:3:0x000a, B:4:0x0017, B:6:0x001e, B:9:0x003c, B:12:0x0085, B:14:0x0089, B:16:0x00a5, B:18:0x00a9, B:56:0x025b, B:58:0x0260, B:62:0x0285, B:81:0x02e0, B:51:0x0206, B:52:0x0234, B:54:0x023a, B:21:0x00c3, B:23:0x00db, B:25:0x00ed, B:26:0x00f0, B:28:0x0108, B:29:0x010b, B:31:0x0123, B:32:0x0126, B:34:0x013e, B:35:0x0141, B:37:0x0151, B:39:0x016a, B:40:0x016d, B:42:0x0183, B:43:0x0186, B:45:0x01cd, B:47:0x01dd, B:48:0x01e0, B:44:0x01af, B:86:0x02eb), top: B:91:0x000a }] */
                        /* JADX WARN: Removed duplicated region for block: B:81:0x02e0 A[Catch: all -> 0x02e9, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x02e9, IllegalArgumentException -> 0x02eb, blocks: (B:3:0x000a, B:4:0x0017, B:6:0x001e, B:9:0x003c, B:12:0x0085, B:14:0x0089, B:16:0x00a5, B:18:0x00a9, B:56:0x025b, B:58:0x0260, B:62:0x0285, B:81:0x02e0, B:51:0x0206, B:52:0x0234, B:54:0x023a, B:21:0x00c3, B:23:0x00db, B:25:0x00ed, B:26:0x00f0, B:28:0x0108, B:29:0x010b, B:31:0x0123, B:32:0x0126, B:34:0x013e, B:35:0x0141, B:37:0x0151, B:39:0x016a, B:40:0x016d, B:42:0x0183, B:43:0x0186, B:45:0x01cd, B:47:0x01dd, B:48:0x01e0, B:44:0x01af, B:86:0x02eb), top: B:91:0x000a }] */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final void run() {
                            /*
                                Method dump skipped, instructions count: 785
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.tlj.run():void");
                        }
                    });
                    tlkVar2.d.start();
                    return;
                }
            }
            ((tug) ((tug) tmi.a.g()).j("com/google/android/tv/remote/virtual/client/VoiceService$1", "handleMessage", 196, "VoiceService.java")).s("Received voice request while being inactive");
            tlx tlxVar = this.b;
            vtw vtwVarM = tms.a.m();
            vtw vtwVarM2 = tnu.a.m();
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            tnu tnuVar = (tnu) vtwVarM2.b;
            tnuVar.b |= 1;
            tnuVar.c = i4;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            tms tmsVar = (tms) vtwVarM.b;
            tnu tnuVar2 = (tnu) vtwVarM2.r();
            tnuVar2.getClass();
            tmsVar.c = tnuVar2;
            tmsVar.b = 32;
            tlxVar.a((tms) vtwVarM.r());
            return;
        }
        tms tmsVar2 = (i == 3 ? (tnn) tnqVar.c : tnn.a).b;
        if (tmsVar2 == null) {
            tmsVar2 = tms.a;
        }
        int i5 = tmsVar2.b;
        if (i5 == 0) {
            i3 = 18;
        } else if (i5 == 1) {
            i3 = 1;
        } else if (i5 == 2) {
            i3 = 2;
        } else if (i5 != 50) {
            if (i5 == 51) {
                i3 = 13;
            } else if (i5 == 60) {
                i3 = 14;
            } else if (i5 == 61) {
                i3 = 15;
            } else if (i5 == 70) {
                i3 = 17;
            } else if (i5 != 90) {
                switch (i5) {
                    case 8:
                        i3 = 3;
                        break;
                    case 9:
                        i3 = 4;
                        break;
                    case 10:
                        i3 = 5;
                        break;
                    default:
                        switch (i5) {
                            case 20:
                                i3 = 6;
                                break;
                            case 21:
                                i3 = 7;
                                break;
                            case 22:
                                i3 = 8;
                                break;
                            default:
                                switch (i5) {
                                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                                        i3 = 9;
                                        break;
                                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                                        i3 = 10;
                                        break;
                                    case 32:
                                        i3 = 11;
                                        break;
                                    default:
                                        i3 = 0;
                                        break;
                                }
                        }
                }
            } else {
                i3 = 16;
            }
        }
        int i6 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        if (i6 != 8) {
            return;
        }
        ((tug) ((tug) tmi.a.g()).j("com/google/android/tv/remote/virtual/client/VoiceService$1", "handleMessage", 221, "VoiceService.java")).s("Server has rejected to start voice");
        tnr tnrVar = tmsVar2.b == 30 ? (tnr) tmsVar2.c : tnr.a;
        tmi tmiVar3 = this.c;
        int i7 = tnrVar.e;
        if (tmiVar3.e == i7) {
            tmiVar3.g.a();
            tmiVar3.e = 0;
        }
        if (tmiVar3.f == i7) {
            tmiVar3.g.a();
            tmiVar3.f = 0;
        }
    }

    @Override // defpackage.tma
    public final void b() {
        tmi tmiVar = this.c;
        if (tmiVar.f != 0) {
            ((tug) ((tug) tmi.a.e()).j("com/google/android/tv/remote/virtual/client/VoiceService$1", "onDisconnected", 247, "VoiceService.java")).s("Disconnected in the middle of voice stream");
            tmiVar.f = 0;
        }
        tmiVar.e = 0;
    }

    @Override // defpackage.tma
    public final void c(int i) {
        int i2 = tmf.VOICE.k;
        if (i2 == 0) {
            throw null;
        }
        boolean z = (i & i2) != 0;
        this.a = z;
        if (z) {
            return;
        }
        tmi tmiVar = this.c;
        if (tmiVar.e == 0 && tmiVar.f == 0) {
            return;
        }
        tmiVar.g.a();
        tmiVar.e = 0;
    }
}
