package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vzp implements vuk {
    private final /* synthetic */ int a;

    public vzp(int i) {
        this.a = i;
    }

    @Override // defpackage.vuk
    public final /* synthetic */ Object a(int i) {
        int i2 = this.a;
        Object obj = null;
        if (i2 != 0) {
            if (i2 == 1) {
                if (i == 0) {
                    obj = vzm.AUDIO_CAPABILITY_UNSPECIFIED;
                } else if (i == 1) {
                    obj = vzm.CHANNELS_5_1;
                }
                return obj == null ? vzm.UNRECOGNIZED : obj;
            }
            if (i2 == 2) {
                wkf wkfVarB = wkf.b(i);
                return wkfVarB == null ? wkf.TYPE_UNSPECIFIED : wkfVarB;
            }
            if (i2 == 3) {
                wkw wkwVarB = wkw.b(i);
                return wkwVarB == null ? wkw.TYPE_UNSPECIFIED : wkwVarB;
            }
            if (i == 0) {
                obj = wlq.COMPONENT_FILTER_UNSPECIFIED;
            } else if (i == 1) {
                obj = wlq.EXCLUDE_DISLIKED_ENTITIES;
            } else if (i == 2) {
                obj = wlq.EXCLUDE_NON_WATCHLISTED_ENTITIES;
            }
            return obj == null ? wlq.UNRECOGNIZED : obj;
        }
        switch (i) {
            case 0:
                obj = vzq.VIDEO_CAPABILITY_UNSPECIFIED;
                break;
            case 1:
                obj = vzq.VIDEO_2D;
                break;
            case 2:
                obj = vzq.VIDEO_3D;
                break;
            case 3:
                obj = vzq.HDR_PQ;
                break;
            case 4:
                obj = vzq.HDR_10;
                break;
            case 5:
                obj = vzq.IMMERSIVE;
                break;
            case 6:
                obj = vzq.VR_DISALLOWED;
                break;
            case 7:
                obj = vzq.HDR_DOLBY_VISION;
                break;
            case 8:
                obj = vzq.HDR_10_PLUS;
                break;
        }
        return obj == null ? vzq.UNRECOGNIZED : obj;
    }
}
