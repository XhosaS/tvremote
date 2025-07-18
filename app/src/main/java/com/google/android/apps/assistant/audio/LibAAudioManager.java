package com.google.android.apps.assistant.audio;

import android.media.AudioManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface LibAAudioManager {
    int abandonAudioFocus(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener);

    void adjustStreamVolume(int i, int i2, int i3);

    int getStreamMaxVolume(int i);

    int getStreamVolume(int i);

    int requestAudioFocus(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i, int i2);

    void setStreamVolume(int i, int i2, int i3);
}
