package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.audiopolicy.AudioVolumeGroup;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bgp extends bgn {
    public final int c;
    private final bgo h;

    public bgp(Context context) {
        int id;
        super(context);
        this.h = new bgo(this);
        List audioVolumeGroups = AudioManager.getAudioVolumeGroups();
        Iterator it = (audioVolumeGroups == null ? Collections.EMPTY_LIST : audioVolumeGroups).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                id = -1;
                break;
            }
            AudioVolumeGroup audioVolumeGroup = (AudioVolumeGroup) it.next();
            Iterator it2 = audioVolumeGroup.getAudioAttributes().iterator();
            while (it2.hasNext()) {
                if (((AudioAttributes) it2.next()).getUsage() == 1) {
                    id = audioVolumeGroup.getId();
                    break loop0;
                }
            }
        }
        this.c = id;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Type inference failed for: r0v1, types: [bgx, java.lang.Object] */
    @Override // defpackage.bgn, defpackage.bgt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.bgm b(defpackage.bgl r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L8
            r5 = 0
            bgm r5 = super.b(r5)
            return r5
        L8:
            bzt r0 = r4.f
            boolean r1 = r0.f()
            if (r1 == 0) goto L13
            bgm r5 = defpackage.bgm.NONE
            return r5
        L13:
            java.lang.Object r0 = r0.b
            if (r0 == 0) goto L75
            int r1 = r5.b
            r2 = 6
            if (r1 == r2) goto L28
            r2 = 19
            if (r1 == r2) goto L28
            r2 = 23
            if (r1 == r2) goto L28
            switch(r1) {
                case 8: goto L28;
                case 9: goto L28;
                case 10: goto L28;
                default: goto L27;
            }
        L27:
            goto L75
        L28:
            java.lang.String r5 = r5.c
            bgw r2 = new bgw
            r2.<init>(r1, r5)
            int r5 = r0.a(r2)
            r0 = 9
            r2 = 10
            r3 = 1
            if (r1 == r0) goto L3d
            if (r1 != r2) goto L5a
            r1 = r2
        L3d:
            if (r5 != r3) goto L5a
            bzt r5 = r4.b
            java.lang.Object r5 = r5.a
            android.content.ContentResolver r5 = (android.content.ContentResolver) r5
            java.lang.String r0 = "hdmi_control_enabled"
            int r0 = android.provider.Settings.Global.getInt(r5, r0, r3)
            if (r0 != r3) goto L57
            java.lang.String r0 = "hdmi_control_volume_control_enabled"
            int r5 = android.provider.Settings.Global.getInt(r5, r0, r3)
            if (r5 != r3) goto L57
            r5 = r3
            goto L5a
        L57:
            bgm r5 = defpackage.bgm.NONE
            return r5
        L5a:
            if (r1 != r2) goto L5f
            bgm r5 = defpackage.bgm.INCREMENTAL
            return r5
        L5f:
            if (r5 == 0) goto L72
            if (r5 == r3) goto L6f
            r0 = 2
            if (r5 == r0) goto L6f
            r0 = 3
            if (r5 == r0) goto L72
            r0 = 4
            if (r5 == r0) goto L72
            bgm r5 = defpackage.bgm.NONE
            return r5
        L6f:
            bgm r5 = defpackage.bgm.INCREMENTAL
            return r5
        L72:
            bgm r5 = defpackage.bgm.VARIABLE
            return r5
        L75:
            bgm r0 = c(r5)
            if (r0 == 0) goto L7c
            return r0
        L7c:
            bgm r5 = super.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgp.b(bgl):bgm");
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.bgt
    public void d() {
        super.d();
        bgo bgoVar = this.h;
        bgf bgfVar = new bgf(bgoVar);
        bzt bztVar = this.f;
        bztVar.c.put(bgoVar, bgfVar);
        ((AudioManager) bztVar.a).registerVolumeGroupCallback(this.e, bgfVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.bgt
    public void e() {
        super.e();
        bzt bztVar = this.f;
        AudioManager.VolumeGroupCallback volumeGroupCallback = (AudioManager.VolumeGroupCallback) bztVar.c.remove(this.h);
        if (volumeGroupCallback != null) {
            ((AudioManager) bztVar.a).unregisterVolumeGroupCallback(volumeGroupCallback);
        }
    }
}
