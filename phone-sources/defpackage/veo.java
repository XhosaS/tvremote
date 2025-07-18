package defpackage;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class veo implements uqr {
    private final rmp b;
    private final ImmutableSet c;
    private final /* synthetic */ int d;

    public veo(int i, byte[] bArr) {
        this.d = i;
        this.b = rmp.a(vep.a, new rmp("ModifyEntitlement"));
        this.c = ImmutableSet.of();
    }

    @Override // defpackage.uqr
    public final rmp a() {
        switch (this.d) {
        }
        return this.b;
    }

    @Override // defpackage.uqr
    public final uqs b() {
        switch (this.d) {
        }
        return vgk.g;
    }

    @Override // defpackage.uqr
    public final Set c() {
        switch (this.d) {
            case 0:
                ImmutableSet immutableSet = this.c;
                return immutableSet.isEmpty() ? vep.l.m : immutableSet;
            case 1:
                ImmutableSet immutableSet2 = this.c;
                return immutableSet2.isEmpty() ? vep.l.m : immutableSet2;
            case 2:
                ImmutableSet immutableSet3 = this.c;
                return immutableSet3.isEmpty() ? vep.l.m : immutableSet3;
            case 3:
                ImmutableSet immutableSet4 = this.c;
                return immutableSet4.isEmpty() ? vep.l.m : immutableSet4;
            case 4:
                ImmutableSet immutableSet5 = this.c;
                return immutableSet5.isEmpty() ? vep.l.m : immutableSet5;
            case 5:
                ImmutableSet immutableSet6 = this.c;
                return immutableSet6.isEmpty() ? vep.l.m : immutableSet6;
            case 6:
                ImmutableSet immutableSet7 = this.c;
                return immutableSet7.isEmpty() ? vep.l.m : immutableSet7;
            case 7:
                ImmutableSet immutableSet8 = this.c;
                return immutableSet8.isEmpty() ? vep.l.m : immutableSet8;
            case 8:
                ImmutableSet immutableSet9 = this.c;
                return immutableSet9.isEmpty() ? vep.l.m : immutableSet9;
            case 9:
                ImmutableSet immutableSet10 = this.c;
                return immutableSet10.isEmpty() ? vep.l.m : immutableSet10;
            case 10:
                ImmutableSet immutableSet11 = this.c;
                return immutableSet11.isEmpty() ? vev.j.k : immutableSet11;
            case 11:
                ImmutableSet immutableSet12 = this.c;
                return immutableSet12.isEmpty() ? vev.j.k : immutableSet12;
            case 12:
                ImmutableSet immutableSet13 = this.c;
                return immutableSet13.isEmpty() ? vev.j.k : immutableSet13;
            case 13:
                ImmutableSet immutableSet14 = this.c;
                return immutableSet14.isEmpty() ? vev.j.k : immutableSet14;
            case 14:
                ImmutableSet immutableSet15 = this.c;
                return immutableSet15.isEmpty() ? vev.j.k : immutableSet15;
            case 15:
                ImmutableSet immutableSet16 = this.c;
                return immutableSet16.isEmpty() ? vev.j.k : immutableSet16;
            case 16:
                ImmutableSet immutableSet17 = this.c;
                return immutableSet17.isEmpty() ? vev.j.k : immutableSet17;
            case 17:
                ImmutableSet immutableSet18 = this.c;
                return immutableSet18.isEmpty() ? vev.j.k : immutableSet18;
            case 18:
                ImmutableSet immutableSet19 = this.c;
                return immutableSet19.isEmpty() ? vgk.g.h : immutableSet19;
            case 19:
                ImmutableSet immutableSet20 = this.c;
                return immutableSet20.isEmpty() ? vgk.g.h : immutableSet20;
            default:
                ImmutableSet immutableSet21 = this.c;
                return immutableSet21.isEmpty() ? vgk.g.h : immutableSet21;
        }
    }

    @Override // defpackage.uqr
    public final boolean d() {
        switch (this.d) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 15:
            case 17:
                return false;
            case 14:
            case 16:
            default:
                return true;
        }
    }

    @Override // defpackage.uqr
    public final int e() {
        switch (this.d) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 11:
            case 12:
            case 13:
            case 15:
            case 16:
                return 3;
            case 8:
            case 9:
            case 14:
            default:
                return 2;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    public final String toString() {
        switch (this.d) {
        }
        return this.b.a;
    }

    public veo(int i) {
        this.d = i;
        this.b = rmp.a(vep.a, new rmp("FetchLibrary"));
        this.c = ImmutableSet.of();
    }

    public veo(int i, char[] cArr) {
        this.d = i;
        this.b = rmp.a(vep.a, new rmp("AcquirePurchase"));
        this.c = ImmutableSet.of();
    }

    public veo(int i, short[] sArr) {
        this.d = i;
        this.b = rmp.a(vep.a, new rmp("Grant"));
        this.c = ImmutableSet.of();
    }

    public veo(int i, int[] iArr) {
        this.d = i;
        this.b = rmp.a(vep.a, new rmp("Share"));
        this.c = ImmutableSet.of();
    }

    public veo(int i, boolean[] zArr) {
        this.d = i;
        this.b = rmp.a(vep.a, new rmp("UnShare"));
        this.c = ImmutableSet.of();
    }

    public veo(int i, float[] fArr) {
        this.d = i;
        this.b = rmp.a(vep.a, new rmp("Cancel"));
        this.c = ImmutableSet.of();
    }

    public veo(int i, byte[][] bArr) {
        this.d = i;
        this.b = rmp.a(vep.a, new rmp("Redeem"));
        this.c = ImmutableSet.of();
    }

    public veo(int i, char[][] cArr) {
        this.d = i;
        this.b = rmp.a(vep.a, new rmp("FindVouchers"));
        this.c = ImmutableSet.of();
    }

    public veo(int i, short[][] sArr) {
        this.d = i;
        this.b = rmp.a(vep.a, new rmp("FetchByToken"));
        this.c = ImmutableSet.of();
    }

    public veo(int i, int[][] iArr) {
        this.d = i;
        this.b = rmp.a(vev.a, new rmp("FetchCencLicense"));
        this.c = ImmutableSet.of();
    }

    public veo(int i, boolean[][] zArr) {
        this.d = i;
        this.b = rmp.a(vev.a, new rmp("FetchQcLicense"));
        this.c = ImmutableSet.of();
    }

    public veo(int i, float[][] fArr) {
        this.d = i;
        this.b = rmp.a(vev.a, new rmp("FetchYoutubePolicy"));
        this.c = ImmutableSet.of();
    }

    public veo(int i, byte[][][] bArr) {
        this.d = i;
        this.b = rmp.a(vev.a, new rmp("FetchFairplayLicense"));
        this.c = ImmutableSet.of();
    }

    public veo(int i, char[][][] cArr) {
        this.d = i;
        this.b = rmp.a(vev.a, new rmp("FetchFreeplayLicense"));
        this.c = ImmutableSet.of("https://www.googleapis.com/auth/android_video");
    }

    public veo(int i, short[][][] sArr) {
        this.d = i;
        this.b = rmp.a(vev.a, new rmp("FetchPlayreadyLicense"));
        this.c = ImmutableSet.of();
    }

    public veo(int i, int[][][] iArr) {
        this.d = i;
        this.b = rmp.a(vev.a, new rmp("FetchThirdPartyLicense"));
        this.c = ImmutableSet.of("https://www.googleapis.com/auth/android_video");
    }

    public veo(int i, boolean[][][] zArr) {
        this.d = i;
        this.b = rmp.a(vev.a, new rmp("GetCommonEncryptionKey"));
        this.c = ImmutableSet.of();
    }

    public veo(int i, float[][][] fArr) {
        this.d = i;
        this.b = rmp.a(vgk.a, new rmp("GetStreamInfoInternal"));
        this.c = ImmutableSet.of();
    }

    public veo(int i, byte[] bArr, byte[] bArr2) {
        this.d = i;
        this.b = rmp.a(vgk.a, new rmp("GetStreamInfoForHls"));
        this.c = ImmutableSet.of();
    }

    public veo(int i, char[] cArr, byte[] bArr) {
        this.d = i;
        this.b = rmp.a(vgk.a, new rmp("GetStreamInfoForDash"));
        this.c = ImmutableSet.of();
    }
}
