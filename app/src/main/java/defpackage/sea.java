package defpackage;

import android.content.Context;
import android.content.ContextParams;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.MediaRecorder;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sea implements sdz {
    public static final zdy a = zdy.h("com/google/android/libraries/search/audio/audiosource/audiorecord/impl/DefaultAudioRecordFactory");
    public final sek b;

    public sea(sek sekVar) {
        sekVar.getClass();
        this.b = sekVar;
    }

    @Override // defpackage.sdz
    public final /* synthetic */ sdy a(sec secVar) throws UnsupportedOperationException, sln, IllegalArgumentException {
        AudioRecord.Builder bufferSizeInBytes;
        tix tixVarB;
        zdy zdyVar = a;
        zeo zeoVarB = zdyVar.b();
        zer zerVar = zfi.a;
        ((zdv) zeoVarB.o(zerVar, "ALT.AudioRecordFactory").q("com/google/android/libraries/search/audio/audiosource/audiorecord/impl/DefaultAudioRecordFactory", "create", 38, "DefaultAudioRecordFactory.kt")).u("#audio# createAudioRecord");
        ruo ruoVar = secVar.e;
        if (ruoVar == null) {
            ruoVar = ruo.a;
        }
        if (ruoVar.c > MediaRecorder.getAudioSourceMax()) {
            throw new sln("#createAudioRecord failed: invalid android audio source, only non-system supported.", skj.b(rxh.FAILED_OPENING_INCORRECT_AUDIO_SOURCE_TYPE));
        }
        try {
            AudioFormat.Builder builder = new AudioFormat.Builder();
            ruo ruoVar2 = secVar.e;
            if (ruoVar2 == null) {
                ruoVar2 = ruo.a;
            }
            AudioFormat.Builder encoding = builder.setEncoding(ruoVar2.f);
            ruo ruoVar3 = secVar.e;
            if (ruoVar3 == null) {
                ruoVar3 = ruo.a;
            }
            AudioFormat.Builder sampleRate = encoding.setSampleRate(ruoVar3.d);
            if ((secVar.b & 128) != 0) {
                sampleRate.setChannelIndexMask(secVar.j);
            } else {
                ruo ruoVar4 = secVar.e;
                if (ruoVar4 == null) {
                    ruoVar4 = ruo.a;
                }
                sampleRate.setChannelMask(ruoVar4.e);
            }
            AudioRecord.Builder builder2 = new AudioRecord.Builder();
            ruo ruoVar5 = secVar.e;
            if (ruoVar5 == null) {
                ruoVar5 = ruo.a;
            }
            AudioRecord.Builder audioFormat = builder2.setAudioSource(ruoVar5.c).setAudioFormat(sampleRate.build());
            ruo ruoVar6 = secVar.e;
            if (ruoVar6 == null) {
                ruoVar6 = ruo.a;
            }
            int i = ruoVar6.d;
            bufferSizeInBytes = audioFormat.setBufferSizeInBytes(Math.max(szr.b(ruoVar6) * (i > 16000 ? 128000 / i : 8), AudioRecord.getMinBufferSize(ruoVar6.d, ruoVar6.e, ruoVar6.f)));
        } catch (IllegalArgumentException e) {
            e = e;
        }
        try {
            sek sekVar = this.b;
            bufferSizeInBytes.getClass();
            int i2 = secVar.c;
            int i3 = i2 != 0 ? i2 != 4 ? i2 != 6 ? 0 : 2 : 1 : 3;
            if (i3 == 0) {
                throw null;
            }
            int i4 = i3 - 1;
            if (i4 == 0) {
                sag sagVar = i2 == 4 ? (sag) secVar.d : sag.a;
                sagVar.getClass();
                if (Build.VERSION.SDK_INT < 31) {
                    throw new sln("failed to append attribution source, outdated Android SDK.", skj.b(rxh.FAILED_OPENING_SOURCE_ATTRIBUTION_UNSUPPORTED_AUDIO_SDK));
                }
                yqt yqtVarB = sekVar.b.b(sagVar);
                if (!yqtVarB.g()) {
                    throw new sln("failed to append attribution source, missing", skj.b(rxh.FAILED_OPENING_MISSING_SOURCE_ATTRIBUTION));
                }
                ContextParams contextParamsBuild = new ContextParams.Builder().setNextAttributionSource(mr$$ExternalSyntheticApiModelOutline0.m(yqtVarB.c())).build();
                contextParamsBuild.getClass();
                bufferSizeInBytes.setContext(sekVar.c.createContext(contextParamsBuild));
            } else if (i4 == 1) {
                if (i2 != 6 || (tixVarB = tix.b(((Integer) secVar.d).intValue())) == null) {
                    tixVarB = tix.TAG_DO_NOT_USE;
                }
                tixVarB.getClass();
                if (Build.VERSION.SDK_INT >= 31) {
                    Context contextCreateAttributionContext = sekVar.c;
                    if (Build.VERSION.SDK_INT >= 30) {
                        contextCreateAttributionContext = contextCreateAttributionContext.createAttributionContext(tiy.a(tixVarB));
                        contextCreateAttributionContext.getClass();
                    }
                    bufferSizeInBytes.setContext(contextCreateAttributionContext);
                }
            } else {
                if (i4 != 2) {
                    throw new agpg();
                }
                ((zdv) sek.a.b().o(zerVar, "ALT.AudioRecordAttrId").q("com/google/android/libraries/search/audio/audiosource/impl/AudioRecordAttribution", "attributePermissively", 47, "AudioRecordAttribution.kt")).u("#audio# no audio record attribution specified, continue without...");
            }
            AudioRecord audioRecordBuild = bufferSizeInBytes.build();
            if (audioRecordBuild.getState() == 1) {
                audioRecordBuild.getClass();
                return new sdy(audioRecordBuild);
            }
            ((zdv) zdyVar.d().o(zerVar, "ALT.AudioRecordFactory").q("com/google/android/libraries/search/audio/audiosource/audiorecord/impl/DefaultAudioRecordFactory", "create", 65, "DefaultAudioRecordFactory.kt")).u("#audio# createAudioRecord failed: state initialized error.");
            audioRecordBuild.release();
            throw new sln("#createAudioRecord failed: audio record state initialized error.", skj.b(rxh.FAILED_OPENING_ERROR_INIT));
        } catch (IllegalArgumentException e2) {
            e = e2;
            ((zdv) a.d().o(zfi.a, "ALT.AudioRecordFactory").q("com/google/android/libraries/search/audio/audiosource/audiorecord/impl/DefaultAudioRecordFactory", "create", 74, "DefaultAudioRecordFactory.kt")).u("#audio# createAudioRecord failed: error creating audio record.");
            throw new sln("#createAudioRecord failed: error creating audio record.", skj.b(rxh.FAILED_OPENING_ERROR_INIT), e);
        }
    }
}
