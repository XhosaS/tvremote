package com.google.android.tv.remote.service;

import android.os.ParcelFileDescriptor;
import defpackage.bmr;
import defpackage.bod;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AutoValue_AudioStream extends bmr {
    private final ParcelFileDescriptor a;
    private final bod b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;

    public AutoValue_AudioStream(ParcelFileDescriptor parcelFileDescriptor, bod bodVar, int i, int i2, int i3, int i4) {
        this.a = parcelFileDescriptor;
        this.b = bodVar;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    @Override // defpackage.bmr
    public final int a() {
        return this.d;
    }

    @Override // defpackage.bmr
    public final int b() {
        return this.c;
    }

    @Override // defpackage.bmr
    public final int c() {
        return this.f;
    }

    @Override // defpackage.bmr
    public final int d() {
        return this.e;
    }

    @Override // defpackage.bmr
    public final ParcelFileDescriptor e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bmr) {
            bmr bmrVar = (bmr) obj;
            ParcelFileDescriptor parcelFileDescriptor = this.a;
            if (parcelFileDescriptor != null ? parcelFileDescriptor.equals(bmrVar.e()) : bmrVar.e() == null) {
                bod bodVar = this.b;
                if (bodVar != null ? bodVar.equals(bmrVar.f()) : bmrVar.f() == null) {
                    if (this.c == bmrVar.b() && this.d == bmrVar.a() && this.e == bmrVar.d() && this.f == bmrVar.c()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.bmr
    public final bod f() {
        return this.b;
    }

    public final int hashCode() {
        ParcelFileDescriptor parcelFileDescriptor = this.a;
        int iHashCode = parcelFileDescriptor == null ? 0 : parcelFileDescriptor.hashCode();
        bod bodVar = this.b;
        return ((((((((((iHashCode ^ 1000003) * 1000003) ^ (bodVar != null ? bodVar.hashCode() : 0)) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f;
    }

    public final String toString() {
        bod bodVar = this.b;
        return "AudioStream{directAudioStream=" + String.valueOf(this.a) + ", indirectAudioStream=" + String.valueOf(bodVar) + ", channelCount=" + this.c + ", bitsPerSample=" + this.d + ", sampleRate=" + this.e + ", interactionModel=" + this.f + "}";
    }
}
