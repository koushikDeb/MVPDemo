package com.iodroid.koushik.smartkids90scontentsforkids.Presenter;

import com.iodroid.koushik.smartkids90scontentsforkids.MainMVP.MainMVP_interface;
import com.iodroid.koushik.smartkids90scontentsforkids.Model.VideoModel;
import com.takusemba.multisnaprecyclerview.MultiSnapRecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amaresh on 05-01-2019.
 */

public class MainPresenter implements MainMVP_interface.presenter {

  private   MainMVP_interface.view view;


    public MainPresenter(MainMVP_interface.view view )
    {
        this.view=view;
    }

    @Override
    public void createMovieslist() {
        view.populaterecycerViewmovie(getlist(5,"http://www.gstatic.com/tv/thumb/v22vodart/12863030/p12863030_v_v8_ae.jpg"));

    }

    @Override
    public void createshortcartoonslist() {

        view.populaterecycerViewshort(getlist(15,"https://4.bp.blogspot.com/-BV2xlHZtk44/WQd1h5R037I/AAAAAAAAAFM/Refx0rt1C-MqOeum2nRtNuVZrn3RTmoxQCLcB/s1600/Shinchan%2BMovie%2BKaanta%2BLagaa%2BTC%2B2.jpg"));

    }

    @Override
    public void craeteknowledgelist()
    {
        view.populaterecycerViewknowledge(getlist(10,"https://thumbs.mic.com/MDg5ZDg2MDc1MyMvOFRiOGxUV1cwRWYyNzRqWlFnUlVLdDZlUFFRPS8weDY4OjE5MTZ4MTI3Ny84MDB4NDUwL2ZpbHRlcnM6Zm9ybWF0KGpwZWcpOnF1YWxpdHkoODApL2h0dHBzOi8vczMuYW1hem9uYXdzLmNvbS9wb2xpY3ltaWMtaW1hZ2VzLzljMWRiN2VjZThlMjRmNTQ2YTIzNzU2NTBiMDI3Y2UyMDkxNzEyODQ5ZWIwYzVmZWE1ODNmMTg5MWYyMWIyNjAuanBn.jpg"));

    }







    public List<VideoModel> getlist(int wantedlength,String image)
    {
        List<VideoModel> rplist = new ArrayList<VideoModel>();
        VideoModel vm =new VideoModel("http://test.com", "001",false, "a simple test", "marvel", "Avengers", image, "4.2",20000);
        for(int i=0;i<wantedlength;i++) {
            rplist.add(vm);
        }
        return rplist;
    }




}
