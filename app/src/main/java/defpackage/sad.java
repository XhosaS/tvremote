package defpackage;

import android.media.AudioDeviceInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sad {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final AudioDeviceInfo d;
    private final String e;

    public sad(String str, int i, boolean z, boolean z2, AudioDeviceInfo audioDeviceInfo) {
        this.e = str;
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = audioDeviceInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sad)) {
            return false;
        }
        sad sadVar = (sad) obj;
        return agvy.c(this.e, sadVar.e) && this.a == sadVar.a && this.b == sadVar.b && this.c == sadVar.c && agvy.c(this.d, sadVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.e.hashCode() * 31;
        AudioDeviceInfo audioDeviceInfo = this.d;
        boolean z = this.c;
        return ((((((iHashCode + this.a) * 31) + sac.a(this.b)) * 31) + sac.a(z)) * 31) + audioDeviceInfo.hashCode();
    }

    public final String toString() {
        return "AecInternalConfig(inputDeviceAddress=" + this.e + ", channelIndexMask=" + this.a + ", useAudiofxForAec=" + this.b + ", useAudiofxForNs=" + this.c + ", device=" + this.d + ")";
    }
}
