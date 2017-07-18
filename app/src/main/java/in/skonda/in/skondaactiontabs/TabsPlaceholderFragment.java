package in.skonda.in.skondaactiontabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.VideoView;

/**
 * Created by sudarsan.konda on 07/18/2017.
 */

public  class TabsPlaceholderFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    public TabsPlaceholderFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static TabsPlaceholderFragment newInstance(int sectionNumber) {
        TabsPlaceholderFragment fragment = new TabsPlaceholderFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
//        final VideoView videoView = (VideoView) rootView.findViewById(R.id.videoView);
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        Log.d("skondad:", "view returned" );

            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
//        videoView.setVideoURI(VideoUrls.videos.get(getArguments().getInt(ARG_SECTION_NUMBER)));
//        videoView.seekTo(1000);
//        videoView.setOnTouchListener(new View.OnTouchListener() {
  //          @Override
    //        public boolean onTouch(View v, MotionEvent event) {
//
//                videoView.start();
//                return true;
//            }
//        });
//            videoView.start();
            textView.setTextSize(30);

        return rootView;
    }
}