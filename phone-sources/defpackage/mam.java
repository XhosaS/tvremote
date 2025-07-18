package defpackage;

import com.google.android.apps.play.movies.common.view.subtitles.SubtitleWindow;
import com.google.android.apps.play.movies.common.view.subtitles.SubtitleWindow2B;
import com.google.android.apps.play.movies.common.view.subtitles.SubtitleWindowSettings;
import com.google.android.apps.play.movies.common.view.subtitles.SubtitleWindowSettings2B;
import com.google.android.apps.play.movies.common.view.subtitles.SubtitleWindowSettingsTimeline;
import com.google.android.apps.play.movies.common.view.subtitles.SubtitleWindowSettingsTimeline2B;
import com.google.android.apps.play.movies.common.view.subtitles.SubtitleWindowSettingsTimelineT;
import com.google.android.apps.play.movies.common.view.subtitles.SubtitleWindowT;
import com.google.android.apps.play.movies.common.view.subtitles.SubtitleWindowTextTimeline;
import com.google.android.apps.play.movies.common.view.subtitles.SubtitleWindowTextTimeline2B;
import com.google.android.apps.play.movies.common.view.subtitles.Subtitles;
import java.io.InputStream;
import java.io.ObjectInputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mam extends lfd {
    @Override // defpackage.lfd
    protected final ObjectInputStream c(InputStream inputStream) {
        mec mecVar = new mec(inputStream);
        mecVar.a("com.google.android.videos.subtitles.Subtitles", Subtitles.class);
        mecVar.a("com.google.android.videos.subtitles.Subtitles", lvx.class);
        mecVar.a("com.google.android.videos.service.subtitles.Subtitles", lvj.class);
        mecVar.a("com.google.android.videos.subtitles.SubtitleWindow", SubtitleWindow.class);
        mecVar.a("com.google.android.videos.subtitles.SubtitleWindow", SubtitleWindowT.class);
        mecVar.a("com.google.android.videos.service.subtitles.SubtitleWindow", SubtitleWindow2B.class);
        mecVar.a("com.google.android.videos.subtitles.SubtitleWindowSettings", SubtitleWindowSettings.class);
        mecVar.a("com.google.android.videos.service.subtitles.SubtitleWindowSettings", SubtitleWindowSettings2B.class);
        mecVar.a("com.google.android.videos.subtitles.SubtitleWindowSettingsTimeline", SubtitleWindowSettingsTimeline.class);
        mecVar.a("com.google.android.videos.subtitles.SubtitleWindowSettingsTimeline", SubtitleWindowSettingsTimelineT.class);
        mecVar.a("com.google.android.videos.service.subtitles.SubtitleWindowSettingsTimeline", SubtitleWindowSettingsTimeline2B.class);
        mecVar.a("com.google.android.videos.subtitles.SubtitleWindowTextTimeline", SubtitleWindowTextTimeline.class);
        mecVar.a("com.google.android.videos.service.subtitles.SubtitleWindowTextTimeline", SubtitleWindowTextTimeline2B.class);
        mecVar.a("com.google.android.youtube.core.model.Subtitle", map.class);
        mecVar.a("com.google.android.youtube.core.model.Subtitle$Line", mao.class);
        mecVar.a("com.google.android.videos.service.subtitles.SubtitleTrack", kwx.class);
        mecVar.a("com.google.android.videos.service.subtitles.SubtitleWindow", SubtitleWindow.class);
        mecVar.a("com.google.android.videos.service.subtitles.SubtitleWindowSettings", SubtitleWindowSettings.class);
        mecVar.a("com.google.android.videos.service.subtitles.SubtitleWindowSettingsTimeline", SubtitleWindowSettingsTimeline.class);
        mecVar.a("com.google.android.videos.service.subtitles.SubtitleWindowTextTimeline", SubtitleWindowTextTimeline.class);
        mecVar.a("com.google.android.videos.service.subtitles.Subtitles", Subtitles.class);
        return mecVar;
    }
}
