package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sly {
    public final boolean a(Uri uri) {
        String authority = uri.getAuthority();
        if (authority == null) {
            return false;
        }
        return authority.equals("com.google.android.apps.gsa.voiceinteraction.hotword.HotwordAudioProvider") || authority.equals("com.google.android.apps.gsa.staticplugins.bisto.util.StreamedMessageContentProvider") || authority.equals("com.google.android.apps.tvsearch.voice.controller.AudioFileDescriptorProvider") || authority.equals("com.google.android.apps.gsa.nga.engine.bisto.TranscriptionAudioProvider");
    }
}
