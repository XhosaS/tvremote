package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class luv implements luu {
    private final AudioManager a;

    public luv(AudioManager audioManager) {
        this.a = audioManager;
    }

    private final boolean c() {
        int length;
        int[] encodings;
        AudioDeviceInfo[] devices = this.a.getDevices(2);
        if (devices == null || (length = devices.length) == 0) {
            return true;
        }
        return length == 1 && ((encodings = devices[0].getEncodings()) == null || encodings.length == 0);
    }

    @Override // defpackage.luu
    public final int a() {
        if (c()) {
            return 0;
        }
        AudioDeviceInfo[] devices = this.a.getDevices(2);
        int i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            int[] channelCounts = audioDeviceInfo.getChannelCounts();
            if (channelCounts.length != 0) {
                int i2 = channelCounts[0];
                for (int i3 = 1; i3 < channelCounts.length; i3++) {
                    int i4 = channelCounts[i3];
                    if (i4 > i2) {
                        i2 = i4;
                    }
                }
                if (i2 < i) {
                    i = i2;
                }
            }
        }
        return i;
    }

    @Override // defpackage.luu
    public final boolean b(int i) {
        if (c()) {
            return false;
        }
        for (AudioDeviceInfo audioDeviceInfo : this.a.getDevices(2)) {
            int[] encodings = audioDeviceInfo.getEncodings();
            if (encodings != null && (encodings.length) != 0) {
                for (int i2 : encodings) {
                    int i3 = i2 != i ? i3 + 1 : 0;
                }
                return false;
            }
        }
        return true;
    }
}
