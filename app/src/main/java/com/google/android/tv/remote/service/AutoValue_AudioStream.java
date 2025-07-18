package com.google.android.tv.remote.service;

import android.os.ParcelFileDescriptor;
import defpackage.vej;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AutoValue_AudioStream extends AudioStream {
    private final ParcelFileDescriptor a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final vej f;

    public AutoValue_AudioStream(ParcelFileDescriptor parcelFileDescriptor, vej vejVar, int i, int i2, int i3, int i4) {
        this.a = parcelFileDescriptor;
        this.f = vejVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // com.google.android.tv.remote.service.AudioStream
    public final int a() {
        return this.c;
    }

    @Override // com.google.android.tv.remote.service.AudioStream
    public final int b() {
        return this.b;
    }

    @Override // com.google.android.tv.remote.service.AudioStream
    public final int c() {
        return this.e;
    }

    @Override // com.google.android.tv.remote.service.AudioStream
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioStream) {
            AudioStream audioStream = (AudioStream) obj;
            ParcelFileDescriptor parcelFileDescriptor = this.a;
            if (parcelFileDescriptor != null ? parcelFileDescriptor.equals(audioStream.f()) : audioStream.f() == null) {
                vej vejVar = this.f;
                if (vejVar != null ? vejVar.equals(audioStream.g()) : audioStream.g() == null) {
                    if (this.b == audioStream.b() && this.c == audioStream.a() && this.d == audioStream.d() && this.e == audioStream.c()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.tv.remote.service.AudioStream
    public final ParcelFileDescriptor f() {
        return this.a;
    }

    @Override // com.google.android.tv.remote.service.AudioStream
    public final vej g() {
        return this.f;
    }

    public final int hashCode() {
        ParcelFileDescriptor parcelFileDescriptor = this.a;
        int iHashCode = parcelFileDescriptor == null ? 0 : parcelFileDescriptor.hashCode();
        vej vejVar = this.f;
        return ((((((((((iHashCode ^ 1000003) * 1000003) ^ (vejVar != null ? vejVar.hashCode() : 0)) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e;
    }

    public final String toString() {
        vej vejVar = this.f;
        return "AudioStream{directAudioStream=" + String.valueOf(this.a) + ", indirectAudioStream=" + String.valueOf(vejVar) + ", channelCount=" + this.b + ", bitsPerSample=" + this.c + ", sampleRate=" + this.d + ", interactionModel=" + this.e + "}";
    }
}
